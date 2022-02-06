package Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Work [] works = { new AutoPartsStore(new ShiftWorker()),
            new FoodStore(new PermanentWorker())};
        for(Work work : works) {
            work.work();
        }
    }
}
