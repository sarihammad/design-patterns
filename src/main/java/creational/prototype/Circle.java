package creational.prototype;

/**
 * Circle class
 * This is a concrete implementation of the Shape prototype
 */
public class Circle extends Shape {
    private int radius;
    
    public Circle() {
        type = "Circle";
    }
    
    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    @Override
    void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
} 