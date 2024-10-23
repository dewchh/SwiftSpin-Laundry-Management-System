package net.swiftSpin.laundrymanagement.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.swiftSpin.laundrymanagement.dao.signupDAO;
import net.swiftSpin.laundrymanagement.model.signup;

import java.io.IOException;

@WebServlet("/signupServlet")
public class signupServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String mobileNumber = request.getParameter("mobileNumber");
        String securityQuestion = request.getParameter("securityQuestion");
        String answer = request.getParameter("answer");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
       

        signup user = new signup(name, email, mobileNumber, securityQuestion, answer, password, address);

        if (signupDAO.addUser(user.getName(), user.getEmail(), user.getMobileNumber(), user.getSecurityQuestion(),
                user.getAnswer(), user.getPassword(), user.getAddress())) {
            response.sendRedirect("signup.jsp?msg=valid");
        } else {
            response.sendRedirect("signup.jsp?msg=invalid");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
