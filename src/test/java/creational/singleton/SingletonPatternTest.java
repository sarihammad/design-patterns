package creational.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test for the Singleton pattern
 */
public class SingletonPatternTest {
    
    @Test
    public void testBasicSingleton() {
        // Get the singleton instance
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        
        // Both instances should be the same object
        assertSame(instance1, instance2, "Both instances should be the same");
    }
    
    @Test
    public void testThreadSafeSingleton() {
        // Get the thread-safe singleton instance
        ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();
        
        // Both instances should be the same object
        assertSame(instance1, instance2, "Both thread-safe instances should be the same");
    }
} 