package net.swiftSpin.laundrymanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import project.ConnectionProvider;

public class DetailModel {
	public ResultSet getUserDetails(String email) {
        try (Connection con = ConnectionProvider.getCon()) {
            String query = "SELECT * FROM users WHERE email=?";
            try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
                preparedStatement.setString(1, email);
                return preparedStatement.executeQuery();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        }
        public boolean updateUserDetails(String email, String name,String address,  String mobileNumber, String password) {
            try (Connection con = ConnectionProvider.getCon()) {
                String query = "UPDATE users SET name=?,address=?,  mobileNumber=?, password=? WHERE email=?";
                try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
                    preparedStatement.setString(1, name);
                    preparedStatement.setString(2, address);
                    preparedStatement.setString(3, mobileNumber);
                    preparedStatement.setString(4, password);
                    preparedStatement.setString(5, email);

                    int rowsUpdated = preparedStatement.executeUpdate();
                    return rowsUpdated > 0;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
}
