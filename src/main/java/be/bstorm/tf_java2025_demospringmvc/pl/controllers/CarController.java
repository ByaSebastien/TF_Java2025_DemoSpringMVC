package be.bstorm.tf_java2025_demospringmvc.pl.controllers;

import be.bstorm.tf_java2025_demospringmvc.dal.entities.Car;
import be.bstorm.tf_java2025_demospringmvc.dal.repositories.CarRepository;
import be.bstorm.tf_java2025_demospringmvc.pl.models.car.CarDetailsDto;
import be.bstorm.tf_java2025_demospringmvc.pl.models.car.CarForm;
import be.bstorm.tf_java2025_demospringmvc.pl.models.car.CarIndexDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CarController {

    private final CarRepository carRepository;

//    @Autowired
//    public CarController(CarRepository carRepository) {
//        this.carRepository = carRepository;
//    }

    @GetMapping
    public String GetAll(Model model) {

        List<Car> cars = carRepository.findAll();

        List<CarIndexDto> dtos = cars.stream()
                .map(c -> CarIndexDto.fromEntity(c))
                .toList();

//        for (Car c  : cars) {
//            dtos.add(CarIndexDto.fromEntity(c));
//        }

        model.addAttribute("cars", dtos);

        return "car/Index";
    }

    @GetMapping("/{id}")
    public String GetById(@PathVariable Integer id, Model model) {

        Car car = carRepository.findById(id).orElseThrow();
        CarDetailsDto dto = CarDetailsDto.fromEntity(car);

        model.addAttribute("car", dto);

        return "car/Detail";
    }

    @GetMapping("/create")
    public String Create(Model model) {

        model.addAttribute("form",new CarForm());
        return "car/Create";
    }

    @PostMapping("/create")
    public String Create(
            @Valid @ModelAttribute("form") CarForm form,
            BindingResult br) {

        if(br.hasErrors()) {
            return "car/Create";
        }

        carRepository.save(form.toEntity());

        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String Edit(@PathVariable Integer id, Model model) {
        Car car = carRepository.findById(id).orElseThrow();
        CarForm form = CarForm.fromEntity(car);

        model.addAttribute("id", id);
        model.addAttribute("car", form);

        return "car/Edit";
    }

    @PostMapping("/edit/{id}")
    public String Edit(@PathVariable Integer id,@Valid @ModelAttribute CarForm form) {

        Car car = form.toEntity();

        Car existing = carRepository.findById(id).orElseThrow();

        existing.setBrand(car.getBrand());
        existing.setModel(car.getModel());
        existing.setHorsePower(car.getHorsePower());
        existing.setEngineCylinder(car.getEngineCylinder());

        carRepository.save(existing);

        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String Delete(@PathVariable Integer id) {
        carRepository.deleteById(id);
        return "redirect:/";
    }
}
