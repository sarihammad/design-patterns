package creational.abstractfactory;

/**
 * Circle class
 * This is a concrete implementation of the Shape interface
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
} 