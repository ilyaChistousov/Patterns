package Command;

public class StartCommand extends AbstractCommand {

    public StartCommand(Computer computer) {
        super(computer);
    }

    @Override
    void execute() {
        computer.start();
    }
}
