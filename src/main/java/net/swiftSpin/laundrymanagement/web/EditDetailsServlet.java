package net.swiftSpin.laundrymanagement.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.swiftSpin.laundrymanagement.dao.EditDetailModel;

@WebServlet("/EditDetailsServlet")
public class EditDetailsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String address = request.getParameter("address"); 
        String mobileNumber = request.getParameter("mobileNumber");
        String password = request.getParameter("password");

        try {
            EditDetailModel detailModel = new EditDetailModel();
            detailModel.updateUserDetails(email, name,address,  mobileNumber, password);
            response.sendRedirect("changeDetails.jsp?msg=done");
        } catch (Exception e) {
            System.out.println(e);
            response.sendRedirect("changeDetails.jsp?msg=wrong");
        }
        }
        }