package net.swiftSpin.laundrymanagement.dao;

import java.sql.Connection;
import java.sql.Statement;
import project.ConnectionProvider;

public class DeleteLaundryModel {
    public void deleteLaundryById(String id) throws Exception {
        try (Connection con = ConnectionProvider.getCon();
             Statement st = con.createStatement()) {
            st.executeUpdate("DELETE FROM item WHERE id='" + id + "'");
        }
    }
}
