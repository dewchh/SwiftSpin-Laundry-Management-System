package net.swiftSpin.laundrymanagement.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.swiftSpin.laundrymanagement.dao.ManageSupplyModel;

@WebServlet("/manageSupplyServlet")
public class ManageSupplyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String date = request.getParameter("date");
        String name = request.getParameter("name");
        String category = request.getParameter("category");
        String quantity = request.getParameter("quantity");

        try {
            ManageSupplyModel supplyModel = new ManageSupplyModel();
            supplyModel.addSupply(id, date, name, category, quantity);
            response.sendRedirect("manageSupply.jsp?msg=done");
        } catch (Exception e) {
            response.sendRedirect("manageSupply.jsp?msg=wrong");
        }
    }
}
