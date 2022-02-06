package Command;

public class ResetCommand extends AbstractCommand {
    public ResetCommand(Computer computer) {
        super(computer);
    }

    @Override
    void execute() {
        computer.reset();
    }
}
