package Bridge;

public class AutoPartsStore extends Work {

    public AutoPartsStore(Worker worker) {
        super(worker);
    }

    @Override
    public void work() {
        System.out.println("Auto parts Store is working");
        worker.doWork();
    }
}
