package behavioral.chainofresponsibility;

/**
 * Test class for demonstrating the Chain of Responsibility pattern
 */
public class ChainOfResponsibilityTest {
    
    private static Logger getChainOfLoggers() {
        // Create the chain of loggers
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);
        Logger fileLogger = new FileLogger(Logger.DEBUG);
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        
        // Set up the chain
        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);
        
        return consoleLogger;
    }
    
    public static void main(String[] args) {
        // Get the chain of loggers
        Logger loggerChain = getChainOfLoggers();
        
        // Log messages with different levels
        System.out.println("Logging INFO level message:");
        loggerChain.logMessage(Logger.INFO, "This is an information message");
        
        System.out.println("\nLogging DEBUG level message:");
        loggerChain.logMessage(Logger.DEBUG, "This is a debug message");
        
        System.out.println("\nLogging ERROR level message:");
        loggerChain.logMessage(Logger.ERROR, "This is an error message");
    }
} 