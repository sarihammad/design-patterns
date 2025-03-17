package structural.facade;

/**
 * OrderFacade class
 * This is the facade that simplifies the complex subsystems
 */
public class OrderFacade {
    private InventoryService inventoryService;
    private PaymentProcessor paymentProcessor;
    private ShippingService shippingService;
    private NotificationService notificationService;
    
    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentProcessor = new PaymentProcessor();
        this.shippingService = new ShippingService();
        this.notificationService = new NotificationService();
    }
    
    /**
     * Process an order from start to finish
     * This method hides the complexity of the subsystems from the client
     */
    public boolean processOrder(String productId, double amount, String orderId, 
                               String customerEmail, String customerPhone, String shippingAddress) {
        
        System.out.println("=== Processing Order: " + orderId + " ===");
        
        // Check if product is in stock
        boolean inStock = inventoryService.checkStock(productId);
        if (!inStock) {
            System.out.println("Product out of stock!");
            return false;
        }
        
        // Process payment
        boolean paymentSuccessful = paymentProcessor.processPayment(orderId, amount);
        if (!paymentSuccessful) {
            System.out.println("Payment failed!");
            return false;
        }
        
        // Update inventory
        inventoryService.updateInventory(productId);
        
        // Schedule delivery
        shippingService.scheduleDelivery(orderId, shippingAddress);
        String shippingLabel = shippingService.generateShippingLabel(orderId, shippingAddress);
        
        // Send notifications
        notificationService.sendEmail(customerEmail, 
                                     "Order Confirmation: " + orderId, 
                                     "Your order has been processed successfully.");
        
        notificationService.sendSMS(customerPhone, 
                                   "Your order " + orderId + " has been processed. Tracking: " + shippingLabel);
        
        System.out.println("=== Order " + orderId + " processed successfully ===");
        return true;
    }
} 