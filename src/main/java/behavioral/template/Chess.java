package behavioral.template;

/**
 * Chess class
 * This is a concrete implementation of the Game abstract class
 */
public class Chess extends Game {
    @Override
    protected void initialize() {
        System.out.println("Chess Game: Initializing the chess board...");
        System.out.println("Chess Game: Placing pieces in starting positions...");
    }
    
    @Override
    protected void startPlay() {
        System.out.println("Chess Game: Starting a new game of chess!");
        System.out.println("Chess Game: White player makes the first move.");
    }
    
    @Override
    protected void endPlay() {
        System.out.println("Chess Game: Game over. Thanks for playing chess!");
    }
} 