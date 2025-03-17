package creational.abstractfactory;

/**
 * ShapeFactory class
 * This is a concrete factory that creates shape objects
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        
        return null;
    }
    
    @Override
    public Color getColor(String color) {
        return null; // This factory doesn't create colors
    }
} 