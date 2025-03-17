package creational.singleton;

/**
 * Thread-Safe Singleton Pattern
 * 
 * This implementation ensures thread safety using double-checked locking.
 * It prevents multiple instances from being created in a multi-threaded environment.
 */
public class ThreadSafeSingleton {
    // Private static volatile instance of the class
    private static volatile ThreadSafeSingleton instance;
    
    // Private constructor to prevent instantiation from outside
    private ThreadSafeSingleton() {
        System.out.println("Thread-Safe Singleton instance created");
    }
    
    // Public static method to get the instance with double-checked locking
    public static ThreadSafeSingleton getInstance() {
        // First check (without synchronization)
        if (instance == null) {
            // Synchronize on the class object
            synchronized (ThreadSafeSingleton.class) {
                // Second check (with synchronization)
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
    
    public void showMessage() {
        System.out.println("Hello from Thread-Safe Singleton!");
    }
} 