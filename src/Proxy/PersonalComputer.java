package Proxy;

public class PersonalComputer implements Computer {

    private boolean isActive;

    public PersonalComputer() {
        turnOn();
    }

    public void turnOn() {
        System.out.println("Computer turn on...");
        isActive = true;
    }


    @Override
    public void run() {
        System.out.println("Computer running...");
    }
}
