package Command;

public class StopCommand extends AbstractCommand {


    public StopCommand(Computer computer) {
        super(computer);
    }

    @Override
    void execute() {
        computer.stop();
    }
}
