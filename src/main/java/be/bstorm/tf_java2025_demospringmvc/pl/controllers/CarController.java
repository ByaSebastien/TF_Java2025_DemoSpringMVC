package be.bstorm.tf_java2025_demospringmvc.pl.controllers;

import be.bstorm.tf_java2025_demospringmvc.pl.models.Car;
import be.bstorm.tf_java2025_demospringmvc.pl.models.datas.FakeDb;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CarController {

    @GetMapping
    public String GetAll(Model model) {

        List<Car> cars = FakeDb.cars;

        model.addAttribute("cars", cars);

        return "car/Index";
    }

    @GetMapping("/{id}")
    public String GetById(@PathVariable String id, Model model) {

    }

    @GetMapping("/create")
    public String Create() {
        return "car/Create";
    }

    @PostMapping("/create")
    public String Create(@ModelAttribute Car car) {

        FakeDb.AddCar(car);
        return "redirect:/";
    }
}
