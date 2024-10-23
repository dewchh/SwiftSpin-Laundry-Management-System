package net.swiftSpin.laundrymanagement.dao;

import project.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EditUser {
    public boolean updateUser(String id, String name, String dateOfBirth, String address, String mobileNumber) {
        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            con = ConnectionProvider.getCon();
            String updateQuery = "UPDATE user SET name=?, dateOfbirth=?, address=?, mobile_number=? WHERE id=?";
            preparedStatement = con.prepareStatement(updateQuery);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, dateOfBirth);
            preparedStatement.setString(3, address);
            preparedStatement.setString(4, mobileNumber);
            preparedStatement.setString(5, id);

            int rowsUpdated = preparedStatement.executeUpdate();
            return rowsUpdated > 0; // Check if at least one row was updated
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
