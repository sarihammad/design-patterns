package structural.decorator;

/**
 * Test class for demonstrating the Decorator pattern
 */
public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Simple Coffee:");
        System.out.println("Description: " + simpleCoffee.getDescription());
        System.out.println("Cost: $" + simpleCoffee.getCost());
        
        // Add milk to the coffee
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("\nCoffee with Milk:");
        System.out.println("Description: " + milkCoffee.getDescription());
        System.out.println("Cost: $" + milkCoffee.getCost());
        
        // Add sugar to the coffee with milk
        Coffee sweetMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("\nCoffee with Milk and Sugar:");
        System.out.println("Description: " + sweetMilkCoffee.getDescription());
        System.out.println("Cost: $" + sweetMilkCoffee.getCost());
        
        // Create coffee with just sugar
        Coffee sweetCoffee = new SugarDecorator(new SimpleCoffee());
        System.out.println("\nCoffee with Sugar:");
        System.out.println("Description: " + sweetCoffee.getDescription());
        System.out.println("Cost: $" + sweetCoffee.getCost());
        
        // Create double milk coffee
        Coffee doubleMilkCoffee = new MilkDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println("\nCoffee with Double Milk:");
        System.out.println("Description: " + doubleMilkCoffee.getDescription());
        System.out.println("Cost: $" + doubleMilkCoffee.getCost());
    }
} 