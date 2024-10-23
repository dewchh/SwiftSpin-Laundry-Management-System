package net.swiftSpin.laundrymanagement.dao;

import java.sql.Connection;
import java.sql.Statement;
import project.ConnectionProvider;

public class DeleteSupplyModel {
    public void deleteSupplyById(String id) throws Exception {
        try (Connection con = ConnectionProvider.getCon();
             Statement st = con.createStatement()) {
            st.executeUpdate("DELETE FROM supply WHERE id='" + id + "'");
        }
    }
}
