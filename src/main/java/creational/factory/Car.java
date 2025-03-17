package creational.factory;

/**
 * Car class - a concrete implementation of the Vehicle interface
 */
public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car...");
    }
} 