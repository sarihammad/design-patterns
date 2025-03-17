package structural.bridge;

/**
 * Rectangle class
 * This is another refined abstraction in the Bridge pattern
 */
public class Rectangle extends Shape {
    private int width;
    private int height;
    
    public Rectangle(int width, int height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void draw() {
        System.out.print("Drawing Rectangle with width " + width + " and height " + height + ", ");
        color.applyColor();
    }
} 