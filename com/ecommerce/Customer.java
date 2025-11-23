package com.ecommerce;

import java.util.ArrayList;

public class Customer {
    private String customerID;
    private String name;
    private ArrayList<Product> shoppingCart;
    
    public Customer(String customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.shoppingCart = new ArrayList<>();
    }
    
    public String getCustomerID() {
        return customerID;
    }
    
    public String getName() {
        return name;
    }
    
    public void addToCart(Product product) {
        shoppingCart.add(product);
        System.out.println(product.getName() + " added to cart.");
    }
    
    public void removeFromCart(Product product) {
        if (shoppingCart.remove(product)) {
            System.out.println(product.getName() + " removed from cart.");
        } else {
            System.out.println("Product not found in cart.");
        }
    }
    
    public double calculateTotal() {
        double total = 0;
        for (Product product : shoppingCart) {
            total += product.getPrice();
        }
        return total;
    }
    
    public void displayCart() {
        System.out.println("--- Shopping Cart for " + name + " ---");
        if (shoppingCart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (Product product : shoppingCart) {
                product.displayProduct();
            }
            System.out.println("Total: $" + calculateTotal());
        }
    }
}