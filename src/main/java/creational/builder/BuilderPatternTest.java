package creational.builder;

/**
 * Test class for demonstrating the Builder pattern
 */
public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a user with only required parameters
        User user1 = new User.UserBuilder("John", "Doe")
                .build();
        System.out.println("User with only required parameters:");
        System.out.println(user1);
        
        // Create a user with all parameters
        User user2 = new User.UserBuilder("Jane", "Smith")
                .age(30)
                .phone("123-456-7890")
                .address("123 Main St, City, Country")
                .email("jane.smith@example.com")
                .build();
        System.out.println("\nUser with all parameters:");
        System.out.println(user2);
        
        // Create a user with some optional parameters
        User user3 = new User.UserBuilder("Bob", "Johnson")
                .age(45)
                .email("bob.johnson@example.com")
                .build();
        System.out.println("\nUser with some optional parameters:");
        System.out.println(user3);
    }
} 