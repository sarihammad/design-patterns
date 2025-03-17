package structural.decorator;

/**
 * SimpleCoffee class
 * This is a concrete component that implements the Coffee interface
 */
public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
    
    @Override
    public double getCost() {
        return 2.0;
    }
} 