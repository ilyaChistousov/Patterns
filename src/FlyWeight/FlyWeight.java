package FlyWeight;

import java.util.ArrayList;
import java.util.List;

public class FlyWeight {
    public static void main(String[] args) {
        Factory factory = new Factory();
        List<Car> cars = new ArrayList<>();
        cars.add(factory.createCarByOrder("truck"));
        cars.add(factory.createCarByOrder("truck"));
        cars.add(factory.createCarByOrder("truck"));
        cars.add(factory.createCarByOrder("truck"));
        cars.add(factory.createCarByOrder("truck"));
        cars.add(factory.createCarByOrder("Passenger"));
        cars.add(factory.createCarByOrder("Passenger"));
        cars.add(factory.createCarByOrder("Passenger"));
        cars.add(factory.createCarByOrder("truck"));
        cars.add(factory.createCarByOrder("truck"));
        cars.add(factory.createCarByOrder("truck"));

        for(Car car : cars) {
            car.riding();
        }
    }
}
