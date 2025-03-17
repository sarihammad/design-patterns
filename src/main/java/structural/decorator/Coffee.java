package structural.decorator;

/**
 * Coffee interface
 * This is the component interface that concrete components and decorators will implement
 */
public interface Coffee {
    String getDescription();
    double getCost();
} 