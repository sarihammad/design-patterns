package behavioral.mediator;

/**
 * Test class for demonstrating the Mediator pattern
 */
public class MediatorPatternTest {
    public static void main(String[] args) {
        // Create the mediator
        ChatMediator chatRoom = new ChatRoom();
        
        // Create users
        User john = new ChatUser(chatRoom, "John");
        User alice = new ChatUser(chatRoom, "Alice");
        User bob = new ChatUser(chatRoom, "Bob");
        User maria = new ChatUser(chatRoom, "Maria");
        
        // Add users to the chat room
        chatRoom.addUser(john);
        chatRoom.addUser(alice);
        chatRoom.addUser(bob);
        chatRoom.addUser(maria);
        
        // Users send messages
        System.out.println("\nChat session begins:");
        john.send("Hello everyone!");
        alice.send("Hi John, how are you?");
        bob.send("Hey folks, what's up?");
        maria.send("Hello from Maria!");
    }
} 