package structural.proxy;

/**
 * ProxyImage class
 * This is the proxy that controls access to the real subject
 */
public class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;
    
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void display() {
        // Load the image only when needed (lazy loading)
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
} 