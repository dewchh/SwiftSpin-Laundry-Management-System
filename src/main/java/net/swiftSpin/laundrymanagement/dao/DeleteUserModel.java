package net.swiftSpin.laundrymanagement.dao;

import java.sql.Connection;
import java.sql.Statement;
import project.ConnectionProvider;

	public class DeleteUserModel {
	    public void deleteUserById(String id) throws Exception {
	        try (Connection con = ConnectionProvider.getCon();
	             Statement st = con.createStatement()) {
	            st.executeUpdate("DELETE FROM user WHERE id='" + id + "'");
	        }
	    }
	}


