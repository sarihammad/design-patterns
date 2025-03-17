package behavioral.command;

/**
 * LightOnCommand class
 * This is a concrete command that turns a light on
 */
public class LightOnCommand implements Command {
    private Light light;
    
    public LightOnCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.on();
    }
} 