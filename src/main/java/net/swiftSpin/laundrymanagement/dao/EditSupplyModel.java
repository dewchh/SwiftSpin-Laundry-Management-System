package net.swiftSpin.laundrymanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EditSupplyModel {
    public void updateSupply(String id, String date, String name, String category, String quantity) throws Exception {
        try (Connection con = project.ConnectionProvider.getCon()) {
            String query = "update supply set date=?, name=?, category=?, quantity=? where id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, date);
            ps.setString(2, name);
            ps.setString(3, category);
            ps.setString(4, quantity);
            ps.setString(5, id);

            ps.executeUpdate();
        }
    }
}
