package structural.facade;

/**
 * Test class for demonstrating the Facade pattern
 */
public class FacadePatternTest {
    public static void main(String[] args) {
        // Create the facade
        OrderFacade orderFacade = new OrderFacade();
        
        // Process an order using the facade
        // The client doesn't need to know about the complex subsystems
        orderFacade.processOrder(
            "PROD-1234",           // Product ID
            99.99,                 // Amount
            "ORD-5678",            // Order ID
            "customer@example.com", // Customer Email
            "555-123-4567",        // Customer Phone
            "123 Main St, City, Country" // Shipping Address
        );
        
        // Demonstrate what would happen without the facade
        System.out.println("\n=== Without Facade (Complex Interaction) ===");
        
        // Create all the services
        InventoryService inventoryService = new InventoryService();
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        ShippingService shippingService = new ShippingService();
        NotificationService notificationService = new NotificationService();
        
        // Manually orchestrate the process
        String productId = "PROD-1234";
        double amount = 99.99;
        String orderId = "ORD-5678";
        String customerEmail = "customer@example.com";
        String customerPhone = "555-123-4567";
        String shippingAddress = "123 Main St, City, Country";
        
        // Check stock
        boolean inStock = inventoryService.checkStock(productId);
        if (inStock) {
            // Process payment
            boolean paymentSuccessful = paymentProcessor.processPayment(orderId, amount);
            if (paymentSuccessful) {
                // Update inventory
                inventoryService.updateInventory(productId);
                
                // Schedule delivery
                shippingService.scheduleDelivery(orderId, shippingAddress);
                String shippingLabel = shippingService.generateShippingLabel(orderId, shippingAddress);
                
                // Send notifications
                notificationService.sendEmail(
                    customerEmail,
                    "Order Confirmation: " + orderId,
                    "Your order has been processed successfully."
                );
                
                notificationService.sendSMS(
                    customerPhone,
                    "Your order " + orderId + " has been processed. Tracking: " + shippingLabel
                );
                
                System.out.println("Order processed successfully without facade");
            } else {
                System.out.println("Payment failed!");
            }
        } else {
            System.out.println("Product out of stock!");
        }
    }
} 