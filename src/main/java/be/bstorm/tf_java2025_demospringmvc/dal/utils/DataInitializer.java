package be.bstorm.tf_java2025_demospringmvc.dal.utils;

import be.bstorm.tf_java2025_demospringmvc.dal.entities.Car;
import be.bstorm.tf_java2025_demospringmvc.dal.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final CarRepository carRepository;

//    public DataInitializer(CarRepository carRepository) {
//        this.carRepository = carRepository;
//    }

    @Override
    public void run(String... args) throws Exception {

        if (carRepository.count() == 0) {
            List<Car> cars = List.of(
                    Car.builder()
                            .brand("Dodge")
                            .model("Viper")
                            .horsePower(450)
                            .engineCylinder(8)
                            .build(),
                    Car.builder()
                            .brand("Dodge")
                            .model("Ram")
                            .horsePower(395)
                            .engineCylinder(8)
                            .build(),
                    Car.builder()
                            .brand("Ford")
                            .model("Mustang")
                            .horsePower(450)
                            .engineCylinder(8)
                            .build(),
                    Car.builder()
                            .brand("Chevrolet")
                            .model("Camaro")
                            .horsePower(455)
                            .engineCylinder(8)
                            .build(),
                    Car.builder()
                            .brand("BMW")
                            .model("M3")
                            .horsePower(473)
                            .engineCylinder(6)
                            .build(),
                    Car.builder()
                            .brand("Mercedes")
                            .model("AMG GT")
                            .horsePower(523)
                            .engineCylinder(8)
                            .build(),
                    Car.builder()
                            .brand("Audi")
                            .model("RS7")
                            .horsePower(591)
                            .engineCylinder(8)
                            .build(),
                    Car.builder()
                            .brand("Porsche")
                            .model("911 Turbo")
                            .horsePower(572)
                            .engineCylinder(6)
                            .build(),
                    Car.builder()
                            .brand("Ferrari")
                            .model("488 GTB")
                            .horsePower(661)
                            .engineCylinder(8)
                            .build(),
                    Car.builder()
                            .brand("Lamborghini")
                            .model("Huracan")
                            .horsePower(602)
                            .engineCylinder(10)
                            .build()
            );

            carRepository.saveAll(cars);
        }

    }
}
