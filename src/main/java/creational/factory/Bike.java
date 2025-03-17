package creational.factory;

/**
 * Bike class - a concrete implementation of the Vehicle interface
 */
public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a bike...");
    }
} 