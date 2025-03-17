package structural.bridge;

/**
 * GreenColor class
 * This is another concrete implementor in the Bridge pattern
 */
public class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying green color");
    }
} 