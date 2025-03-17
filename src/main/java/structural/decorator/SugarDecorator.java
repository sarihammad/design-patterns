package structural.decorator;

/**
 * SugarDecorator class
 * This is a concrete decorator that adds sugar to coffee
 */
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " + Sugar";
    }
    
    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.2;
    }
} 