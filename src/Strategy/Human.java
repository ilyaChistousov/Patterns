package Strategy;

public class Human {
    private String name;
    private State state;

    public Human(String name) {
        this.name = name;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doIt() {
        state.doIt();
    }

}
