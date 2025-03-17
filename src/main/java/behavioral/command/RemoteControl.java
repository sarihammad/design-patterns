package behavioral.command;

/**
 * RemoteControl class
 * This is the invoker in the Command pattern
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    
    public RemoteControl() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        
        Command noCommand = new NoCommand();
        for (int i = 0; i < 5; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    public void pressOnButton(int slot) {
        onCommands[slot].execute();
    }
    
    public void pressOffButton(int slot) {
        offCommands[slot].execute();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " 
                     + offCommands[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }
    
    // NoCommand class - a null object implementation
    private class NoCommand implements Command {
        @Override
        public void execute() {
            System.out.println("No command assigned to this button");
        }
    }
} 