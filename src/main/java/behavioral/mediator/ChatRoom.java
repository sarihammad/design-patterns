package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * ChatRoom class
 * This is a concrete mediator class
 */
public class ChatRoom implements ChatMediator {
    private List<User> users;
    
    public ChatRoom() {
        this.users = new ArrayList<>();
    }
    
    @Override
    public void addUser(User user) {
        users.add(user);
        System.out.println(((ChatUser)user).name + " joined the chat room");
    }
    
    @Override
    public void sendMessage(String message, User sender) {
        // Send message to all users except the sender
        for (User user : users) {
            if (user != sender) {
                user.receive(message);
            }
        }
    }
} 