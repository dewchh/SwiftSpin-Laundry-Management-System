package net.swiftSpin.laundrymanagement.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.swiftSpin.laundrymanagement.dao.AddFinishedLaundryModel;

@WebServlet("/AddFinishedLaundryServlet")
public class AddFinishedLaundryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String date = request.getParameter("date");
        String customerName = request.getParameter("customername");
        String no_of_items = request.getParameter("no_of_items");
        String price = request.getParameter("price");

        AddFinishedLaundryModel laundryModel = new AddFinishedLaundryModel();
        laundryModel.insertLaundryItem(id, date, customerName, no_of_items, price);

        response.sendRedirect("addFinishedLaundry.jsp?msg=done");
    }
}
