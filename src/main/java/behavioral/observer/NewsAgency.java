package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * NewsAgency class
 * This is a concrete subject that can be observed
 */
public class NewsAgency implements Subject {
    private List<Observer> observers;
    private String news;
    
    public NewsAgency() {
        this.observers = new ArrayList<>();
    }
    
    @Override
    public void register(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }
    
    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }
    
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
    
    public void setNews(String news) {
        this.news = news;
        System.out.println("NewsAgency: News updated to: " + news);
        notifyObservers();
    }
} 