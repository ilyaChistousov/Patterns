package Facade;

public class Facade {
    private Auditor auditor = new Auditor();
    private Inventory inventory = new Inventory();
    private Work work = new Work();

    public void start() {
        work.doWork();
        inventory.startingInventory();
        auditor.doCheck(inventory);
    }

    public void finish() {
        inventory.finishInventory();
        auditor.doCheck(inventory);
        work.doRest();
    }
}
