package Bridge;

public class ShiftWorker implements Worker {
    @Override
    public void doWork() {
        System.out.println("The shift worker came to work");
    }
}
