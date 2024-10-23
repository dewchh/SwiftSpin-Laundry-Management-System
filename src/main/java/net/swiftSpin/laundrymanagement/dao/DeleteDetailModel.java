package net.swiftSpin.laundrymanagement.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import project.ConnectionProvider;

public class DeleteDetailModel {
    public boolean updateDetails(String email, String name,String address, String mobileNumber, String password) {
        try (Connection con = ConnectionProvider.getCon()) {
            String query = "UPDATE users SET name=?,address=?, mobileNumber=?, password=? WHERE email=?";
            try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
                preparedStatement.setString(1, name);
                preparedStatement.setString(3, address);
                preparedStatement.setString(4, mobileNumber);
                preparedStatement.setString(5, password);
                preparedStatement.setString(6, email);

                int rowsUpdated = preparedStatement.executeUpdate();
                return rowsUpdated > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
