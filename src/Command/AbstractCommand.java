package Command;

public abstract class AbstractCommand {
    Computer computer;

    public AbstractCommand(Computer computer) {
        this.computer = computer;
    }

    abstract void execute();
}
