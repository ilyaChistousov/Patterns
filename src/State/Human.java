package State;

public class Human {
    private String name;
    private State state;

    public Human(String name) {
        this.name = name;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void changeState() {
        if(state instanceof Sleeping) {
            setState(new Working());
        } else if(state instanceof Working) {
            setState(new Eating());
        } else if(state instanceof Eating) {
            setState(new Sleeping());
        }
    }

    public void doIt() {
        state.doIt();
    }

}
