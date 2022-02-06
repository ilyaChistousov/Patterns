package Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Blogger blogger = new Blogger();
        Subscriber subscriber = new Subscriber("name1");
        Subscriber subscriber2 = new Subscriber("name2");
        blogger.addObserver(subscriber);
        blogger.addObserver(subscriber2);

        blogger.addContent("new Content");
        blogger.addContent("yep");
        blogger.deleteObserver(subscriber);
        blogger.removeContent("yep");
    }
}
