package Bridge;

public class FoodStore extends Work {

    public FoodStore(Worker worker) {
        super(worker);
    }

    @Override
    public void work() {
        System.out.println("Food store is working");
        worker.doWork();
    }
}
