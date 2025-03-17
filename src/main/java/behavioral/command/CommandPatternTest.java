package behavioral.command;

/**
 * Test class for demonstrating the Command pattern
 */
public class CommandPatternTest {
    public static void main(String[] args) {
        // Create the remote control (invoker)
        RemoteControl remoteControl = new RemoteControl();
        
        // Create the lights (receivers)
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Light bedroomLight = new Light("Bedroom");
        
        // Create the commands
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        
        LightOnCommand bedroomLightOn = new LightOnCommand(bedroomLight);
        LightOffCommand bedroomLightOff = new LightOffCommand(bedroomLight);
        
        // Set the commands to slots
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, bedroomLightOn, bedroomLightOff);
        
        // Print the remote control state
        System.out.println(remoteControl);
        
        // Use the remote control
        System.out.println("Pressing buttons on the remote control:");
        remoteControl.pressOnButton(0);  // Turn on living room light
        remoteControl.pressOnButton(1);  // Turn on kitchen light
        remoteControl.pressOffButton(0); // Turn off living room light
        remoteControl.pressOnButton(2);  // Turn on bedroom light
        remoteControl.pressOffButton(1); // Turn off kitchen light
        
        // Try an unassigned button
        System.out.println("\nTrying an unassigned button:");
        remoteControl.pressOnButton(3);
    }
} 