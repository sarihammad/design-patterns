package structural.facade;

/**
 * PaymentProcessor class
 * This is one of the subsystems that the facade will use
 */
public class PaymentProcessor {
    public boolean processPayment(String orderId, double amount) {
        // In a real application, this would process a payment through a payment gateway
        System.out.println("Processing payment for order: " + orderId + ", Amount: $" + amount);
        return true; // Assume payment is successful
    }
} 