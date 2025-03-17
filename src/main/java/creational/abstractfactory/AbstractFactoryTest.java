package creational.abstractfactory;

/**
 * Test class for demonstrating the Abstract Factory pattern
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        // Get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        
        // Get shape objects from shape factory
        Shape circle = shapeFactory.getShape("CIRCLE");
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        
        System.out.println("Using Shape Factory:");
        circle.draw();
        rectangle.draw();
        
        // Get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        
        // Get color objects from color factory
        Color red = colorFactory.getColor("RED");
        Color blue = colorFactory.getColor("BLUE");
        
        System.out.println("\nUsing Color Factory:");
        red.fill();
        blue.fill();
        
        // Demonstrate that factories are specialized
        System.out.println("\nDemonstrating factory specialization:");
        Color colorFromShapeFactory = shapeFactory.getColor("RED");
        Shape shapeFromColorFactory = colorFactory.getShape("CIRCLE");
        
        System.out.println("Can shape factory create colors? " + (colorFromShapeFactory != null));
        System.out.println("Can color factory create shapes? " + (shapeFromColorFactory != null));
    }
} 