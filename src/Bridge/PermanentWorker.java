package Bridge;

public class PermanentWorker implements Worker {

    @Override
    public void doWork() {
        System.out.println("The permanent worker working as usual");
    }
}
