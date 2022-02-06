package Strategy;

public class Eating implements State {
    @Override
    public void doIt() {
        System.out.println("Just eating");
    }
}
