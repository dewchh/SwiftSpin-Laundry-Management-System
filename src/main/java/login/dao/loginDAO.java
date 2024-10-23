package login.dao;

import java.sql.Connection;
import project.ConnectionProvider;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class loginDAO {
    public boolean validateAdmin(String email, String password) {
        return "admin@gmail.com".equals(email) && "admin".equals(password);
    }

    public boolean validateUser(String email, String password) {
        boolean isValid = false;
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM users WHERE email='" + email + "' AND password='" + password + "'");
            isValid = rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isValid;
    }
}