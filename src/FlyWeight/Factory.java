package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private final Map<String, Car> cars = new HashMap<>();

    public Car createCarByOrder(String type) {
        Car car = cars.get(type);

        if(car == null) {
            switch (type) {
                case "truck" -> {
                    System.out.println("Creating truck");
                    car = new Truck();}
                case "Passenger" -> {
                    System.out.println("Creating Passenger car");
                    car = new PassengerCar();}
            }
            cars.put(type, car);
        }
        return car;
    }
}
