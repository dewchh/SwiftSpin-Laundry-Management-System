package login.web;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login.dao.loginDAO;
import login.model.login;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        login login = new login(email, password);
        loginDAO loginDAO = new loginDAO();

        HttpSession session = request.getSession();

        if (loginDAO.validateAdmin(email, password)) {
            session.setAttribute("email", email);
            response.sendRedirect("adminHome.jsp");
        } else if (loginDAO.validateUser(email, password)) {
            session.setAttribute("email", email);
            response.sendRedirect("home.jsp");
        } else {
            response.sendRedirect("login.jsp?msg=notexist");
        }
    }
}