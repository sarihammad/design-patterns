package creational.prototype;

import java.util.Hashtable;

/**
 * ShapeCache class
 * This class creates and stores shape prototypes and provides methods to retrieve clones
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();
    
    // Load cache with predefined shapes
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        circle.setRadius(10);
        shapeMap.put(circle.getId(), circle);
        
        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        rectangle.setWidth(10);
        rectangle.setHeight(5);
        shapeMap.put(rectangle.getId(), rectangle);
    }
    
    // Get a clone of a shape based on id
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
} 