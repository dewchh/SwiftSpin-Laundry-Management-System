package net.swiftSpin.laundrymanagement.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.swiftSpin.laundrymanagement.dao.DeleteDetailModel;

@WebServlet("/DeleteDetailsServlet")
public class DeleteDetailServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String mobileNumber = request.getParameter("mobileNumber");
        String password = request.getParameter("password");

        DeleteDetailModel userModel = new DeleteDetailModel();
        boolean isUpdateSuccessful = userModel.updateDetails(email, name,address, mobileNumber, password);

        if (isUpdateSuccessful) {
            response.sendRedirect("changeDetails.jsp?msg=done");
        } else {
            response.sendRedirect("changeDetails.jsp?msg=wrong");
        }
    }
}
