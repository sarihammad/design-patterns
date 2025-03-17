package creational.singleton;

/**
 * Test class for demonstrating the Singleton pattern
 */
public class SingletonTest {
    public static void main(String[] args) {
        // Test basic Singleton
        System.out.println("Testing Basic Singleton:");
        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();
        
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
        
        // Test Thread-Safe Singleton
        System.out.println("\nTesting Thread-Safe Singleton:");
        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        threadSafeSingleton1.showMessage();
        
        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();
        System.out.println("Are both thread-safe instances the same? " + (threadSafeSingleton1 == threadSafeSingleton2));
        
        // Test multi-threading with Thread-Safe Singleton
        System.out.println("\nTesting Thread-Safe Singleton with multiple threads:");
        Thread thread1 = new Thread(() -> {
            ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
            System.out.println("Thread 1: " + instance);
        });
        
        Thread thread2 = new Thread(() -> {
            ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
            System.out.println("Thread 2: " + instance);
        });
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
} 