package behavioral.strategy;

/**
 * Test class for demonstrating the Strategy pattern
 */
public class StrategyPatternTest {
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();
        
        // Pay with credit card
        System.out.println("Customer 1 pays with credit card:");
        cart.setPaymentStrategy(new CreditCardPayment(
            "John Doe", 
            "1234567890123456", 
            "123", 
            "12/2025"
        ));
        cart.checkout(100);
        
        // Pay with PayPal
        System.out.println("\nCustomer 2 pays with PayPal:");
        cart.setPaymentStrategy(new PayPalPayment(
            "jane.smith@example.com", 
            "password123"
        ));
        cart.checkout(200);
        
        // Try to checkout without setting a payment strategy
        System.out.println("\nCustomer 3 tries to checkout without a payment method:");
        cart.setPaymentStrategy(null);
        cart.checkout(300);
    }
} 