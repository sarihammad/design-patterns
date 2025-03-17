package structural.bridge;

/**
 * BlueColor class
 * This is a concrete implementor in the Bridge pattern
 */
public class BlueColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
} 