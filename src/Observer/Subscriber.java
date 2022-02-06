package Observer;

import java.util.List;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void observe(List<String> content) {
        System.out.println(name + ", blogger create new content: " + content);
    }
}
