package PracticeTest2;

import java.util.ArrayList;
import java.util.Arrays;

public class Question3 {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new ElectricCar("Blue", 20, 70.2f));
        cars.add(new Car("Red",77.2f));
        cars.add(new Car());
        cars.add(new ElectricCar());
        cars.forEach(car -> System.out.println("Car color is " + car.color + " and speed is " + car.speed));
    }
}
