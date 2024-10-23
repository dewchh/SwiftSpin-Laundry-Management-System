package net.swiftSpin.laundrymanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import project.ConnectionProvider;

public class AddFinishedLaundryModel {
    public void insertLaundryItem(String id, String date, String customer_name, String  no_of_items, String price) {
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("insert into item values(?,?,?,?,?)");
            ps.setString(1, id);
            ps.setString(2, date);
            ps.setString(3, customer_name);
            ps.setString(4, no_of_items);
            ps.setString(5, price);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
