package State;

public class StateDemo {
    public static void main(String[] args) {
        Human human = new Human("Oleg");
        human.setState(new Sleeping());
        human.doIt();
        human.changeState();
        human.doIt();
        human.changeState();
        human.doIt();
        human.changeState();
        human.doIt();
        human.changeState();
        human.doIt();
        human.changeState();
    }
}
