package net.swiftSpin.laundrymanagement.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import project.ConnectionProvider;

public class Inventory {
    private String id;
    private String date;
    private String name;
    private String category;
    private String quantity;

    // Constructors
    public Inventory() {
    }

    public Inventory(String id, String date, String name, String category, String quantity) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    //getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

   

}
