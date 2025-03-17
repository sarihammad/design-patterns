package structural.facade;

/**
 * InventoryService class
 * This is one of the subsystems that the facade will use
 */
public class InventoryService {
    public boolean checkStock(String productId) {
        // In a real application, this would check a database
        System.out.println("Checking stock for product: " + productId);
        return true; // Assume product is in stock
    }
    
    public void updateInventory(String productId) {
        System.out.println("Updating inventory for product: " + productId);
        // In a real application, this would update a database
    }
} 