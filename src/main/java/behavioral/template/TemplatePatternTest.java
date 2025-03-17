package behavioral.template;

/**
 * Test class for demonstrating the Template pattern
 */
public class TemplatePatternTest {
    public static void main(String[] args) {
        // Create a chess game
        Game chess = new Chess();
        System.out.println("Playing Chess:");
        chess.play();
        
        System.out.println("\n------------------------\n");
        
        // Create a football game
        Game football = new Football();
        System.out.println("Playing Football:");
        football.play();
    }
} 