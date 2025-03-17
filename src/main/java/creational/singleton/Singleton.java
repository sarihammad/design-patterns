package creational.singleton;

/**
 * Singleton Pattern
 * 
 * Ensures a class has only one instance and provides a global point of access to it.
 * This is a basic implementation of the Singleton pattern.
 */
public class Singleton {
    // Private static instance of the class
    private static Singleton instance;
    
    // Private constructor to prevent instantiation from outside
    private Singleton() {
        System.out.println("Singleton instance created");
    }
    
    // Public static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
} 