package behavioral.mediator;

/**
 * ChatMediator interface
 * This is the mediator interface
 */
public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
} 