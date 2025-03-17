package structural.adapter;

/**
 * LegacySystem class
 * This represents an existing system with an incompatible interface
 */
public class LegacySystem {
    public void processLegacyData(String data) {
        System.out.println("Legacy system processing data: " + data);
    }
} 