package Facade;

public class Inventory {
    private boolean active;

    public void startingInventory() {
        System.out.println("Inventory started.");
        active = true;
    }

    public void finishInventory() {
        System.out.println("Inventory finished");
        active = false;
    }

    public boolean isActive() {
        return active;
    }
}
