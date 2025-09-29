package be.bstorm.tf_java2025_demospringmvc.pl.models.car;

import be.bstorm.tf_java2025_demospringmvc.dal.entities.Car;

public record CarIndexDto(
        Integer id,
        String brand,
        String model
) {

    public static CarIndexDto fromEntity(Car car){
        return new CarIndexDto(
                car.getId(),
                car.getBrand(),
                car.getModel()
        );
    }
}
