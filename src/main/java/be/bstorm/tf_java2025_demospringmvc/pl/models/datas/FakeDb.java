package be.bstorm.tf_java2025_demospringmvc.pl.models.datas;

import be.bstorm.tf_java2025_demospringmvc.pl.models.Car;

import java.util.ArrayList;
import java.util.List;

public class FakeDb {
    public static int nextId = 11;
    public static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(1, "Dodge", "Viper", 450, 8));
        cars.add(new Car(2, "Dodge", "Ram", 395, 8));
        cars.add(new Car(3, "Ford", "Mustang", 450, 8));
        cars.add(new Car(4, "Chevrolet", "Camaro", 455, 8));
        cars.add(new Car(5, "BMW", "M3", 473, 6));
        cars.add(new Car(6, "Mercedes", "AMG GT", 523, 8));
        cars.add(new Car(7, "Audi", "RS7", 591, 8));
        cars.add(new Car(8, "Porsche", "911 Turbo", 572, 6));
        cars.add(new Car(9, "Ferrari", "488 GTB", 661, 8));
        cars.add(new Car(10, "Lamborghini", "Huracan", 602, 10));
    }

    public static void AddCar(Car car){
        car.setId(nextId++);
        cars.add(car);
    }
}
