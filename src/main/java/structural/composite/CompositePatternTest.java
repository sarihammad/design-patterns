package structural.composite;

/**
 * Test class for demonstrating the Composite pattern
 */
public class CompositePatternTest {
    public static void main(String[] args) {
        // Create the CEO
        Employee CEO = new Employee("John", "CEO", 30000);
        
        // Create department heads
        Employee headSales = new Employee("Robert", "Head Sales", 20000);
        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);
        
        // Create team leads
        Employee salesTeamLead1 = new Employee("Richard", "Sales Team Lead", 10000);
        Employee salesTeamLead2 = new Employee("Rob", "Sales Team Lead", 10000);
        
        Employee marketingTeamLead1 = new Employee("Laura", "Marketing Team Lead", 10000);
        
        // Create employees
        Employee salesEmployee1 = new Employee("David", "Sales", 5000);
        Employee salesEmployee2 = new Employee("James", "Sales", 5000);
        
        Employee marketingEmployee1 = new Employee("Eric", "Marketing", 5000);
        Employee marketingEmployee2 = new Employee("Jessica", "Marketing", 5000);
        
        // Build the organizational structure
        
        // Add department heads to CEO
        CEO.add(headSales);
        CEO.add(headMarketing);
        
        // Add team leads to department heads
        headSales.add(salesTeamLead1);
        headSales.add(salesTeamLead2);
        
        headMarketing.add(marketingTeamLead1);
        
        // Add employees to team leads
        salesTeamLead1.add(salesEmployee1);
        salesTeamLead2.add(salesEmployee2);
        
        marketingTeamLead1.add(marketingEmployee1);
        marketingTeamLead1.add(marketingEmployee2);
        
        // Print the entire organization structure
        System.out.println("Organizational Structure:");
        CEO.showEmployeeDetails();
        
        // Demonstrate removing an employee
        System.out.println("\nAfter removing a sales team lead:");
        headSales.remove(salesTeamLead2);
        CEO.showEmployeeDetails();
    }
} 