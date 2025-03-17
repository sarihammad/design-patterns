package structural.facade;

/**
 * ShippingService class
 * This is one of the subsystems that the facade will use
 */
public class ShippingService {
    public void scheduleDelivery(String orderId, String address) {
        // In a real application, this would schedule a delivery with a shipping provider
        System.out.println("Scheduling delivery for order: " + orderId + " to address: " + address);
    }
    
    public String generateShippingLabel(String orderId, String address) {
        System.out.println("Generating shipping label for order: " + orderId);
        return "SHIPPING_LABEL_" + orderId; // Return a dummy shipping label
    }
} 