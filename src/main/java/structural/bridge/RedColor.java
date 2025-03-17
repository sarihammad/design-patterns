package structural.bridge;

/**
 * RedColor class
 * This is a concrete implementor in the Bridge pattern
 */
public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
} 