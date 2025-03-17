package creational.builder;

/**
 * User class for the Builder pattern
 * This is an immutable class with many optional parameters
 */
public class User {
    // Required parameters
    private final String firstName;
    private final String lastName;
    
    // Optional parameters
    private final int age;
    private final String phone;
    private final String address;
    private final String email;
    
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
        this.email = builder.email;
    }
    
    // Getters for all fields
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return "User: " + firstName + " " + lastName + 
               ", Age: " + age + 
               ", Phone: " + (phone != null ? phone : "N/A") + 
               ", Address: " + (address != null ? address : "N/A") + 
               ", Email: " + (email != null ? email : "N/A");
    }
    
    // Builder class
    public static class UserBuilder {
        // Required parameters
        private final String firstName;
        private final String lastName;
        
        // Optional parameters - initialized with default values
        private int age = 0;
        private String phone = null;
        private String address = null;
        private String email = null;
        
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
        
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
        
        public User build() {
            return new User(this);
        }
    }
} 