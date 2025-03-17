package behavioral.observer;

/**
 * Subject interface
 * This defines the interface for objects that can be observed
 */
public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
} 