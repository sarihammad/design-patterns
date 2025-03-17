package behavioral.strategy;

/**
 * PayPalPayment class
 * This is a concrete strategy for PayPal payments
 */
public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;
    
    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
        System.out.println("PayPal account: " + email);
    }
} 