package structural.bridge;

/**
 * Circle class
 * This is a refined abstraction in the Bridge pattern
 */
public class Circle extends Shape {
    private int radius;
    
    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.print("Drawing Circle with radius " + radius + ", ");
        color.applyColor();
    }
} 