package be.bstorm.tf_java2025_demospringmvc.pl.models.car;

import be.bstorm.tf_java2025_demospringmvc.dal.entities.Car;

public record CarDetailsDto(
        Integer id,
        String brand,
        String model,
        int horsePower,
        int engineCylinder
) {

    public static CarDetailsDto fromEntity(Car car) {
        return new CarDetailsDto(
                car.getId(),
                car.getBrand(),
                car.getModel(),
                car.getHorsePower(),
                car.getEngineCylinder()
        );
    }
}
