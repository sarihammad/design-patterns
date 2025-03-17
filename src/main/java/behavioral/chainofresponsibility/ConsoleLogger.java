package behavioral.chainofresponsibility;

/**
 * ConsoleLogger class
 * This is a concrete handler in the Chain of Responsibility pattern
 */
public class ConsoleLogger extends Logger {
    
    public ConsoleLogger(int level) {
        this.level = level;
    }
    
    @Override
    protected void write(String message) {
        System.out.println("Console Logger: " + message);
    }
} 