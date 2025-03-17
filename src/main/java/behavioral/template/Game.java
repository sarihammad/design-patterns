package behavioral.template;

/**
 * Game abstract class
 * This is the abstract class with the template method
 */
public abstract class Game {
    // Template method
    public final void play() {
        // Initialize the game
        initialize();
        
        // Start the game
        startPlay();
        
        // End the game
        endPlay();
    }
    
    // These methods will be implemented by subclasses
    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();
} 