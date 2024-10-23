package net.swiftSpin.laundrymanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ManageSupplyModel {
    public void addSupply(String id, String date, String name, String category, String quantity) throws Exception {
        try (Connection con = project.ConnectionProvider.getCon()) {
            PreparedStatement ps = con.prepareStatement("insert into supply values(?,?,?,?,?)");
            ps.setString(1, id);
            ps.setString(2, date);
            ps.setString(3, name);
            ps.setString(4, category);
            ps.setString(5, quantity);

            ps.executeUpdate();
        }
    }
}
