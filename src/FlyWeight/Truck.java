package FlyWeight;

public class Truck implements Car {
    @Override
    public void riding() {
        System.out.println("Truck drives slower than normal car...");
    }
}
