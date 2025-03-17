package behavioral.observer;

/**
 * NewsChannel class
 * This is a concrete observer that receives updates from the subject
 */
public class NewsChannel implements Observer {
    private String name;
    private String news;
    
    public NewsChannel(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String news) {
        this.news = news;
        display();
    }
    
    private void display() {
        System.out.println(name + " received news: " + news);
    }
    
    public String getNews() {
        return news;
    }
} 