package behavioral.template;

/**
 * Football class
 * This is another concrete implementation of the Game abstract class
 */
public class Football extends Game {
    @Override
    protected void initialize() {
        System.out.println("Football Game: Initializing the football field...");
        System.out.println("Football Game: Placing players in their positions...");
    }
    
    @Override
    protected void startPlay() {
        System.out.println("Football Game: Kicking off the football match!");
        System.out.println("Football Game: Players start running with the ball.");
    }
    
    @Override
    protected void endPlay() {
        System.out.println("Football Game: Match ended. Final whistle blown!");
    }
} 