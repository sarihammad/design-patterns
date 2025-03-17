package structural.proxy;

/**
 * RealImage class
 * This is the real subject that the proxy represents
 */
public class RealImage implements Image {
    private String fileName;
    
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }
    
    private void loadFromDisk() {
        System.out.println("Loading image: " + fileName);
        // In a real application, this would load the image from disk
    }
    
    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
} 