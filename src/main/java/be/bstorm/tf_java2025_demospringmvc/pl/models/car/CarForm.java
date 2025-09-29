package be.bstorm.tf_java2025_demospringmvc.pl.models.car;

import be.bstorm.tf_java2025_demospringmvc.dal.entities.Car;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CarForm{

    @NotBlank @Size(max = 50)
    private String brand;
    @NotBlank @Size(max = 50)
    private String model;
    @NotNull @Min(0)
    private Integer horsePower;
    @NotNull @Min(0)
    private Integer engineCylinder;

    public CarForm(String brand, String model, Integer horsePower, Integer engineCylinder) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.engineCylinder = engineCylinder;
    }

    public Car toEntity() {
        return Car.builder()
                .brand(this.brand)
                .model(this.model)
                .horsePower(this.horsePower)
                .engineCylinder(this.engineCylinder)
                .build();
    }

    public static CarForm fromEntity(Car car) {
        return new CarForm(
                car.getBrand(),
                car.getModel(),
                car.getHorsePower(),
                car.getEngineCylinder()
        );
    }
}
