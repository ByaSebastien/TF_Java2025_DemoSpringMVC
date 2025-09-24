package be.bstorm.tf_java2025_demospringmvc.pl.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class Car {
    private Integer id;
    private String brand;
    private String model;
    private int horsePower;
    private int engineCylinder;

    public Car(String brand, String model, int horsePower, int engineCylinder) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.engineCylinder = engineCylinder;
    }
}
