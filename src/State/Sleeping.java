package State;

public class Sleeping implements State {
    @Override
    public void doIt() {
        System.out.println("Just sleeping");
    }
}
