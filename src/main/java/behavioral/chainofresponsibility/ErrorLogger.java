package behavioral.chainofresponsibility;

/**
 * ErrorLogger class
 * This is a concrete handler in the Chain of Responsibility pattern
 */
public class ErrorLogger extends Logger {
    
    public ErrorLogger(int level) {
        this.level = level;
    }
    
    @Override
    protected void write(String message) {
        System.out.println("Error Logger: " + message);
    }
} 