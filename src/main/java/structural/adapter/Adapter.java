package structural.adapter;

/**
 * Adapter Pattern
 * 
 * Allows incompatible interfaces to work together.
 * This adapter makes the LegacySystem compatible with the NewSystem interface.
 */
public class Adapter implements NewSystem {
    private LegacySystem legacySystem;
    
    public Adapter(LegacySystem legacySystem) {
        this.legacySystem = legacySystem;
    }
    
    @Override
    public void processData(String data) {
        // Convert the call to the format expected by the legacy system
        System.out.println("Adapter converting data format...");
        legacySystem.processLegacyData(data);
    }
} 