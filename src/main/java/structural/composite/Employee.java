package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Employee class
 * This class serves as both the component and composite in the Composite pattern
 */
public class Employee {
    private String name;
    private String position;
    private int salary;
    private List<Employee> subordinates;
    
    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }
    
    public void add(Employee employee) {
        subordinates.add(employee);
    }
    
    public void remove(Employee employee) {
        subordinates.remove(employee);
    }
    
    public List<Employee> getSubordinates() {
        return subordinates;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPosition() {
        return position;
    }
    
    public int getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
    }
    
    public void showEmployeeDetails() {
        System.out.println(toString());
        
        if (!subordinates.isEmpty()) {
            System.out.println("Subordinates of " + name + ":");
            for (Employee employee : subordinates) {
                System.out.print("  ");
                employee.showEmployeeDetails();
            }
        }
    }
} 