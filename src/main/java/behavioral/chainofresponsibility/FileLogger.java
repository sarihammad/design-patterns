package behavioral.chainofresponsibility;

/**
 * FileLogger class
 * This is a concrete handler in the Chain of Responsibility pattern
 */
public class FileLogger extends Logger {
    
    public FileLogger(int level) {
        this.level = level;
    }
    
    @Override
    protected void write(String message) {
        System.out.println("File Logger: " + message);
    }
} 