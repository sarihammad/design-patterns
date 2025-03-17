package behavioral.strategy;

/**
 * ShoppingCart class
 * This is the context class that uses a payment strategy
 */
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    
    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment strategy set!");
            return;
        }
        
        System.out.println("Checking out with amount: " + amount);
        paymentStrategy.pay(amount);
    }
} 