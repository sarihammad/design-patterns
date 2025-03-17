package creational.prototype;

/**
 * Rectangle class
 * This is another concrete implementation of the Shape prototype
 */
public class Rectangle extends Shape {
    private int width;
    private int height;
    
    public Rectangle() {
        type = "Rectangle";
    }
    
    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle with width: " + width + " and height: " + height);
    }
} 