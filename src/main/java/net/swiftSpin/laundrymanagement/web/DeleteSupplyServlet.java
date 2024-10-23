package net.swiftSpin.laundrymanagement.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.swiftSpin.laundrymanagement.dao.DeleteSupplyModel;

@WebServlet("/DeleteSupplyServlet")
public class DeleteSupplyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        try {
            DeleteSupplyModel deleteModel = new DeleteSupplyModel();
            deleteModel.deleteSupplyById(id);
            response.sendRedirect("inventory.jsp?msg=done");

        } catch (Exception e) {
            System.out.println(e);
            response.sendRedirect("inventory.jsp?msg=wrong");
        }
    }
}
