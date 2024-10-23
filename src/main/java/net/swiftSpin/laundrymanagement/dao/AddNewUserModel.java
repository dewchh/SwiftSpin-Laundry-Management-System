package net.swiftSpin.laundrymanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import project.ConnectionProvider;

public class AddNewUserModel {
    public void insertUser(String id, String name, String dateOfBirth, String address, String mobile_number) {
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?)");
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, dateOfBirth);
            ps.setString(4, address);
            ps.setString(5, mobile_number);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
