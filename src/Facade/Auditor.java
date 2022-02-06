package Facade;

public class Auditor {

    public void doCheck(Inventory inventory) {
        if(inventory.isActive()) {
            System.out.println("The Auditor conducts an inventory.");
        } else {
            System.out.println("The Auditor is relaxing");
        }
    }
}
