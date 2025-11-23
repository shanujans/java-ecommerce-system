package com.ecommerce.orders;

import java.util.ArrayList;
import com.ecommerce.Customer;
import com.ecommerce.Product;

public class Order {
    private String orderID;
    private Customer customer;
    private ArrayList<Product> products;
    private double orderTotal;
    private String status;
    
    public Order(String orderID, Customer customer, ArrayList<Product> products, double orderTotal) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = products;
        this.orderTotal = orderTotal;
        this.status = "Pending";
    }
    
    public String getOrderID() {
        return orderID;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public ArrayList<Product> getProducts() {
        return products;
    }
    
    public double getOrderTotal() {
        return orderTotal;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Order " + orderID + " status updated to: " + newStatus);
    }
    
    public void generateOrderSummary() {
        System.out.println("\n=== ORDER SUMMARY ===");
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Status: " + status);
        System.out.println("Products:");
        
        for (Product product : products) {
            System.out.println("  - " + product.getName() + ": $" + product.getPrice());
        }
        
        System.out.println("Total Amount: $" + orderTotal);
        System.out.println("====================\n");
    }
}