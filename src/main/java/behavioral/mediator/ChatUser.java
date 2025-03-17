package behavioral.mediator;

/**
 * ChatUser class
 * This is a concrete colleague class
 */
public class ChatUser extends User {
    
    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }
    
    @Override
    public void send(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }
    
    @Override
    public void receive(String message) {
        System.out.println(name + " receives: " + message);
    }
} 