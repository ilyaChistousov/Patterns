package Observer;

import java.util.ArrayList;
import java.util.List;

public class Blogger implements Observed {
    private List<String> content = new ArrayList<>();
    private List<Observer> subscribes = new ArrayList<>();

    public void addContent(String content) {
        this.content.add(content);
        notifyObservers();
    }

    public void removeContent(String content) {
        this.content.remove(content);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribes.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        subscribes.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer subscriber : subscribes) {
            subscriber.observe(content);
        }
    }
}
