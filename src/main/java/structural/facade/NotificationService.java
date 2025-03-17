package structural.facade;

/**
 * NotificationService class
 * This is one of the subsystems that the facade will use
 */
public class NotificationService {
    public void sendEmail(String to, String subject, String body) {
        // In a real application, this would send an email
        System.out.println("Sending email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
    
    public void sendSMS(String phoneNumber, String message) {
        // In a real application, this would send an SMS
        System.out.println("Sending SMS to: " + phoneNumber);
        System.out.println("Message: " + message);
    }
} 