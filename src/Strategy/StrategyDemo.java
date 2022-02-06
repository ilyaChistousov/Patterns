package Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Human human = new Human("Valera");
        human.setState(new Eating());
        human.doIt();
        human.setState(new Sleeping());
        human.doIt();
    }
}
