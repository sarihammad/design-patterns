package creational.abstractfactory;

/**
 * AbstractFactory abstract class
 * This is the abstract factory that creates related products
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
} 