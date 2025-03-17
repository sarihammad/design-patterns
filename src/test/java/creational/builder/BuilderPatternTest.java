package creational.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test for the Builder pattern
 */
public class BuilderPatternTest {
    
    @Test
    public void testUserBuilderWithRequiredParams() {
        User user = new User.UserBuilder("John", "Doe").build();
        
        assertEquals("John", user.getFirstName(), "First name should match");
        assertEquals("Doe", user.getLastName(), "Last name should match");
        assertEquals(0, user.getAge(), "Default age should be 0");
        assertNull(user.getPhone(), "Default phone should be null");
        assertNull(user.getAddress(), "Default address should be null");
        assertNull(user.getEmail(), "Default email should be null");
    }
    
    @Test
    public void testUserBuilderWithAllParams() {
        User user = new User.UserBuilder("Jane", "Smith")
                .age(30)
                .phone("123-456-7890")
                .address("123 Main St, City, Country")
                .email("jane.smith@example.com")
                .build();
        
        assertEquals("Jane", user.getFirstName(), "First name should match");
        assertEquals("Smith", user.getLastName(), "Last name should match");
        assertEquals(30, user.getAge(), "Age should match");
        assertEquals("123-456-7890", user.getPhone(), "Phone should match");
        assertEquals("123 Main St, City, Country", user.getAddress(), "Address should match");
        assertEquals("jane.smith@example.com", user.getEmail(), "Email should match");
    }
    
    @Test
    public void testUserBuilderWithSomeParams() {
        User user = new User.UserBuilder("Bob", "Johnson")
                .age(45)
                .email("bob.johnson@example.com")
                .build();
        
        assertEquals("Bob", user.getFirstName(), "First name should match");
        assertEquals("Johnson", user.getLastName(), "Last name should match");
        assertEquals(45, user.getAge(), "Age should match");
        assertNull(user.getPhone(), "Phone should be null");
        assertNull(user.getAddress(), "Address should be null");
        assertEquals("bob.johnson@example.com", user.getEmail(), "Email should match");
    }
} 