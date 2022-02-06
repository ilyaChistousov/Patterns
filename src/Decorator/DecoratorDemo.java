package Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        People people = new RelaxingPerson(new WorkerPerson(new Person()));

        System.out.println(people.live());
    }
}
