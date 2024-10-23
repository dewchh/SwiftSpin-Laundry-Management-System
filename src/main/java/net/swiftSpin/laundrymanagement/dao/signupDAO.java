package net.swiftSpin.laundrymanagement.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import project.ConnectionProvider;

public class signupDAO {
    public static boolean addUser(String name, String email, String mobileNumber, String securityQuestion, String answer, String password,
                                  String address) {
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("INSERT INTO users VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, mobileNumber);
            ps.setString(4, securityQuestion);
            ps.setString(5, answer);
            ps.setString(6, password);
            ps.setString(7, address);
            
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}