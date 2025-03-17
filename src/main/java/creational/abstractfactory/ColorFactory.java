package creational.abstractfactory;

/**
 * ColorFactory class
 * This is a concrete factory that creates color objects
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        return null; // This factory doesn't create shapes
    }
    
    @Override
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        
        if (colorType.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        
        return null;
    }
} 