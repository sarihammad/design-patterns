package structural.bridge;

/**
 * Shape abstract class
 * This is the abstraction in the Bridge pattern
 */
public abstract class Shape {
    protected Color color;
    
    protected Shape(Color color) {
        this.color = color;
    }
    
    abstract public void draw();
} 