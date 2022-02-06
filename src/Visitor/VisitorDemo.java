package Visitor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VisitorDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Hooligan hooligan = new Hooligan();
        Mechanic mechanic = new Mechanic();
        car.accept(hooligan);
        car.accept(mechanic);
    }
}
