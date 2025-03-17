package creational.factory;

/**
 * Factory Pattern
 * 
 * Creates objects without exposing the instantiation logic to the client.
 * This factory creates different types of vehicles based on the input.
 */
public class VehicleFactory {
    
    // Factory method to create vehicles
    public Vehicle createVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        
        return null;
    }
} 