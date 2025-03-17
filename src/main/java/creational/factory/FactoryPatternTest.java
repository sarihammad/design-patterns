package creational.factory;

/**
 * Test class for demonstrating the Factory pattern
 */
public class FactoryPatternTest {
    public static void main(String[] args) {
        // Create a vehicle factory
        VehicleFactory vehicleFactory = new VehicleFactory();
        
        // Create a car using the factory
        Vehicle car = vehicleFactory.createVehicle("CAR");
        System.out.println("Created a car:");
        car.drive();
        
        // Create a bike using the factory
        Vehicle bike = vehicleFactory.createVehicle("BIKE");
        System.out.println("\nCreated a bike:");
        bike.drive();
        
        // Try to create an invalid vehicle
        Vehicle unknown = vehicleFactory.createVehicle("TRUCK");
        System.out.println("\nTrying to create an unknown vehicle type:");
        if (unknown == null) {
            System.out.println("Unknown vehicle type, no vehicle created.");
        }
    }
} 