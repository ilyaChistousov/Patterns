package Memento;

public class MementoDemo {
    public static void main(String[] args) throws InterruptedException {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        Thread.sleep(1000);

        originator.changeState("state");
        Originator.Save save = originator.save();
        System.out.println(originator.toString());
        Thread.sleep(1000);

        originator.changeState("new State");
        System.out.println(originator.toString());
        Thread.sleep(1000);

        originator.getSave(save);
        System.out.println(originator.toString());




    }
}
