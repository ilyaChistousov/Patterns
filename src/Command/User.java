package Command;

public class User {
    private Computer computer;
    private AbstractCommand start;
    private AbstractCommand stop;
    private AbstractCommand reset;

    public User(Computer computer) {
        this.computer = computer;
        start = new StartCommand(computer);
        stop = new StopCommand(computer);
        reset = new ResetCommand(computer);
    }

    public void start() {
        start.execute();
    }

    public void stop() {
        stop.execute();
    }

    public void reset() {
        reset.execute();
    }

}
