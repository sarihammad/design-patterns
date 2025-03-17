package creational.abstractfactory;

/**
 * Red class
 * This is a concrete implementation of the Color interface
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with Red color");
    }
} 