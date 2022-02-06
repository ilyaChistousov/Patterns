package FlyWeight;

public class PassengerCar implements Car {
    @Override
    public void riding() {
        System.out.println("Passenger car drives like a normal car...");
    }
}
