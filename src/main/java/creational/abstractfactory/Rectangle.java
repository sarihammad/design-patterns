package creational.abstractfactory;

/**
 * Rectangle class
 * This is a concrete implementation of the Shape interface
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
} 