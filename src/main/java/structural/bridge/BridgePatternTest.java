package structural.bridge;

/**
 * Test class for demonstrating the Bridge pattern
 */
public class BridgePatternTest {
    public static void main(String[] args) {
        // Create different colors (implementors)
        Color red = new RedColor();
        Color blue = new BlueColor();
        
        // Create shapes with different colors
        Shape redCircle = new Circle(10, red);
        Shape blueCircle = new Circle(5, blue);
        Shape redRectangle = new Rectangle(10, 5, red);
        Shape blueRectangle = new Rectangle(20, 10, blue);
        
        // Draw the shapes
        System.out.println("Drawing shapes with different colors:");
        redCircle.draw();
        blueCircle.draw();
        redRectangle.draw();
        blueRectangle.draw();
        
        // Demonstrate the flexibility of the bridge pattern
        System.out.println("\nDemonstrating flexibility - changing implementations:");
        
        // Create a new shape with existing color
        Shape largeRedCircle = new Circle(20, red);
        largeRedCircle.draw();
        
        // Create a new color
        Color green = new GreenColor();
        
        // Use the new color with existing shape types
        Shape greenCircle = new Circle(15, green);
        Shape greenRectangle = new Rectangle(15, 8, green);
        
        greenCircle.draw();
        greenRectangle.draw();
    }
} 