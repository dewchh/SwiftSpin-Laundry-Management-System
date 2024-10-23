package net.swiftSpin.laundrymanagement.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.swiftSpin.laundrymanagement.dao.LaundryModel;

import java.io.IOException;

@WebServlet("/editLaundryServlet")
public class editLaundryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String date = request.getParameter("date");
        String customer_name = request.getParameter("customername");
        String no_of_items = request.getParameter("no_of_items");
        String price = request.getParameter("price");

        LaundryModel laundryModel = new LaundryModel();

        if (LaundryModel.updateLaundry(id, date, customer_name, no_of_items, price)) {
            response.sendRedirect("finishedLaundryList.jsp?msg=done");
        } else {
            response.sendRedirect("finishedLaundryList.jsp?msg=wrong");
        }
    }
}
