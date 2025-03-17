package behavioral.command;

/**
 * LightOffCommand class
 * This is a concrete command that turns a light off
 */
public class LightOffCommand implements Command {
    private Light light;
    
    public LightOffCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.off();
    }
} 