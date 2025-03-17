package behavioral.observer;

/**
 * Test class for demonstrating the Observer pattern
 */
public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create the subject (news agency)
        NewsAgency newsAgency = new NewsAgency();
        
        // Create observers (news channels)
        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");
        NewsChannel channel3 = new NewsChannel("Channel 3");
        
        // Register observers with the subject
        newsAgency.register(channel1);
        newsAgency.register(channel2);
        newsAgency.register(channel3);
        
        // Set news and notify all observers
        System.out.println("Breaking news broadcast:");
        newsAgency.setNews("Breaking News: Important event happened!");
        
        // Unregister one observer
        System.out.println("\nUnregistering Channel 2...");
        newsAgency.unregister(channel2);
        
        // Set news again and notify remaining observers
        System.out.println("\nUpdate news broadcast:");
        newsAgency.setNews("Update: More details about the event.");
        
        // Add a new observer
        System.out.println("\nRegistering Channel 4...");
        NewsChannel channel4 = new NewsChannel("Channel 4");
        newsAgency.register(channel4);
        
        // Set news again and notify all observers
        System.out.println("\nFinal news broadcast:");
        newsAgency.setNews("Final Update: Event has concluded.");
    }
} 