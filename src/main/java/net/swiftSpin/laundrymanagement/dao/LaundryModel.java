package net.swiftSpin.laundrymanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import project.ConnectionProvider;

public class LaundryModel {
    public static boolean updateLaundry(String id, String date, String customer_name, String no_of_items, String price) {
        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            con = ConnectionProvider.getCon();
            String updateQuery = "UPDATE item SET date=?, customer_name=?, no_of_items=?, price=? WHERE id=?";
            preparedStatement = con.prepareStatement(updateQuery);
            preparedStatement.setString(1, date);
            preparedStatement.setString(2, customer_name);
            preparedStatement.setString(3, no_of_items);
            preparedStatement.setString(4, price);
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
