package net.swiftSpin.laundrymanagement.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.swiftSpin.laundrymanagement.dao.AddNewUserModel;

@WebServlet("/AddNewUserServlet")
public class AddNewUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String dateOfbirth = request.getParameter("dateOfbirth");
        String address = request.getParameter("address");
        String mobileNumber = request.getParameter("mobile_number");

        AddNewUserModel newUserModel = new AddNewUserModel();
        newUserModel.insertUser(id, name, dateOfbirth, address, mobileNumber);

        response.sendRedirect("addNewUser.jsp?msg=done");
    }
}
