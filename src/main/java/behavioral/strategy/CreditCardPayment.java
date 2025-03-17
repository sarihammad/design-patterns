package behavioral.strategy;

/**
 * CreditCardPayment class
 * This is a concrete strategy for credit card payments
 */
public class CreditCardPayment implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String expiryDate;
    
    public CreditCardPayment(String name, String cardNumber, String cvv, String expiryDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card.");
        System.out.println("Card details: " + name + ", " + 
                           "Card Number: " + maskCardNumber(cardNumber) + ", " + 
                           "CVV: ***");
    }
    
    private String maskCardNumber(String cardNumber) {
        return "xxxx-xxxx-xxxx-" + cardNumber.substring(cardNumber.length() - 4);
    }
} 