package net.swiftSpin.laundrymanagement.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.swiftSpin.laundrymanagement.dao.EditUser;

@WebServlet("/EditUserServlet")
public class EditUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String dateOfbirth = request.getParameter("dateOfbirth"); // Correct the parameter name
        String address = request.getParameter("address");
        String mobileNumber = request.getParameter("mobile_number");

        EditUser userModel = new EditUser();

        if (userModel.updateUser(id, name, dateOfbirth, address, mobileNumber)) {
            response.sendRedirect("User.jsp?msg=done");
        } else {
            response.sendRedirect("User.jsp?msg=wrong");
        }
    }
}