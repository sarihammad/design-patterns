package creational.prototype;

/**
 * Test class for demonstrating the Prototype pattern
 */
public class PrototypePatternTest {
    public static void main(String[] args) {
        // Load the shape cache with prototypes
        ShapeCache.loadCache();
        
        // Clone and use the circle prototype
        Shape clonedCircle = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedCircle.getType());
        clonedCircle.draw();
        
        // Clone and use the rectangle prototype
        Shape clonedRectangle = ShapeCache.getShape("2");
        System.out.println("\nShape: " + clonedRectangle.getType());
        clonedRectangle.draw();
        
        // Demonstrate that clones are different objects but with same values
        Circle originalCircle = (Circle) ShapeCache.getShape("1");
        Circle anotherCircle = (Circle) ShapeCache.getShape("1");
        
        System.out.println("\nDemonstrating that clones are different objects:");
        System.out.println("Original Circle Hash: " + originalCircle.hashCode());
        System.out.println("Cloned Circle Hash: " + anotherCircle.hashCode());
        System.out.println("Are they the same object? " + (originalCircle == anotherCircle));
        System.out.println("Do they have the same radius? " + 
                          (originalCircle.getRadius() == anotherCircle.getRadius()));
    }
} 