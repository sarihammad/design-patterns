package structural.proxy;

/**
 * Test class for demonstrating the Proxy pattern
 */
public class ProxyPatternTest {
    public static void main(String[] args) {
        // Using the proxy to load and display an image
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");
        
        // Image will be loaded from disk only when display() is called
        System.out.println("First time displaying image1:");
        image1.display(); // loading happens here
        
        System.out.println("\nSecond time displaying image1:");
        image1.display(); // loading doesn't happen again
        
        System.out.println("\nFirst time displaying image2:");
        image2.display(); // loading happens here
        
        // Demonstrate direct use of RealImage for comparison
        System.out.println("\nUsing RealImage directly:");
        Image realImage = new RealImage("photo3.jpg"); // loading happens immediately
        realImage.display();
    }
} 