# Java E-Commerce System

### Project Description
A simple e-commerce system built in Java that demonstrates package organization, encapsulation, and object-oriented programming principles. This project was created as part of the Programming 1 course assignment.

### Features
- ✅ Product management with Product class
- ✅ Shopping cart functionality with Customer class  
- ✅ Order processing with Order class
- ✅ Package-based code organization (`com.ecommerce` and `com.ecommerce.orders`)
- ✅ Proper encapsulation with private attributes and public methods
- ✅ Import statements between packages


### Classes Overview

#### Product Class
- Represents products with ID, name, and price
- Includes constructors, getters, setters, and display methods

#### Customer Class  
- Manages customer information and shopping cart
- Handles add/remove from cart and total calculation
- Displays cart contents

#### Order Class
- Processes customer orders
- Tracks order status and generates summaries
- Manages order information

### How to Compile and Run

#### Step 1: Compile the Classes
Run these commands in order:

```cmd
javac com/ecommerce/Product.java
javac com/ecommerce/Customer.java
javac com/ecommerce/orders/Order.java
javac Main.java

```

### Step 2: Run the Program

```cmd
java Main
```

## Expected Output
The program will demonstrate:

- Product creation and display

- Customer registration

- Adding products to shopping cart

- Cart management and total calculation

- Order creation and status updates

- Order summary generation

```
=== SIMPLE E-COMMERCE SYSTEM ===

Creating products...
Available Products:
Product ID: P001, Name: Laptop, Price: $999.99
Product ID: P002, Name: Wireless Mouse, Price: $29.99

Creating customer...
Customer created: John Doe

--- Shopping ---
Laptop added to cart.
Wireless Mouse added to cart.

=== ORDER SUMMARY ===
Order ID: ORD001
Customer: John Doe
Status: Shipped
Products:
  - Laptop: $999.99
  - Wireless Mouse: $29.99
Total Amount: $1029.98
```

## Technologies Used
- Java Programming Language

- Package-based architecture

- Object-Oriented Programming principles

- GitHub for version control

## Learning Objectives Achieved
- Java package organization and management

- Encapsulation and data hiding

- Import statement usage

- Object-oriented design

- Code modularity and reusability

## Repository
GitHub URL: https://github.com/shanujans/java-ecommerce-system

Branch: main

Last Updated: 2025.11.24
