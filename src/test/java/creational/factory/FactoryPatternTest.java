package creational.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test for the Factory pattern
 */
public class FactoryPatternTest {
    
    @Test
    public void testCreateCar() {
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle = factory.createVehicle("CAR");
        
        // Check that a Car was created
        assertNotNull(vehicle, "Vehicle should not be null");
        assertTrue(vehicle instanceof Car, "Vehicle should be a Car");
    }
    
    @Test
    public void testCreateBike() {
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle = factory.createVehicle("BIKE");
        
        // Check that a Bike was created
        assertNotNull(vehicle, "Vehicle should not be null");
        assertTrue(vehicle instanceof Bike, "Vehicle should be a Bike");
    }
    
    @Test
    public void testCreateInvalidVehicle() {
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle = factory.createVehicle("TRUCK");
        
        // Check that null is returned for invalid vehicle type
        assertNull(vehicle, "Vehicle should be null for invalid type");
    }
} 