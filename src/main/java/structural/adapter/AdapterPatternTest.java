package structural.adapter;

/**
 * Test class for demonstrating the Adapter pattern
 */
public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create a legacy system
        LegacySystem legacySystem = new LegacySystem();
        
        // Create an adapter that wraps the legacy system
        NewSystem adapter = new Adapter(legacySystem);
        
        // Client code can now use the new system interface
        System.out.println("Client using the adapter:");
        adapter.processData("Sample data");
        
        // Direct use of legacy system for comparison
        System.out.println("\nDirect use of legacy system:");
        legacySystem.processLegacyData("Sample data");
    }
} 