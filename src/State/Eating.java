package State;

public class Eating implements State {
    @Override
    public void doIt() {
        System.out.println("Just eating");
    }
}
