import com.ecommerce.Product;
import com.ecommerce.Customer;
import com.ecommerce.orders.Order;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMPLE E-COMMERCE SYSTEM ===\n");
        
        // Create products
        System.out.println("Creating products...");
        Product laptop = new Product("P001", "Laptop", 999.99);
        Product mouse = new Product("P002", "Wireless Mouse", 29.99);
        Product keyboard = new Product("P003", "Mechanical Keyboard", 79.99);
        
        // Display products
        System.out.println("\nAvailable Products:");
        laptop.displayProduct();
        mouse.displayProduct();
        keyboard.displayProduct();
        
        // Create a customer
        System.out.println("\nCreating customer...");
        Customer customer1 = new Customer("C001", "John Doe");
        System.out.println("Customer created: " + customer1.getName());
        
        // Add products to cart
        System.out.println("\n--- Shopping ---");
        customer1.addToCart(laptop);
        customer1.addToCart(mouse);
        
        // Display cart
        customer1.displayCart();
        
        // Create order
        System.out.println("\nCreating order...");
        ArrayList<Product> orderProducts = new ArrayList<>();
        orderProducts.add(laptop);
        orderProducts.add(mouse);
        double total = laptop.getPrice() + mouse.getPrice();
        
        Order order1 = new Order("ORD001", customer1, orderProducts, total);
        order1.generateOrderSummary();
        
        // Update order status
        order1.updateStatus("Shipped");
        order1.generateOrderSummary();
        
        System.out.println("=== PROGRAM END ===");
    }
}