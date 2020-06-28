package com.marcinrosol.creational.controller;

import com.marcinrosol.creational.builder.Models.Car;
import com.marcinrosol.creational.builder.Models.builders.CarBuilder;
import com.marcinrosol.creational.decorator.CarA;
import com.marcinrosol.creational.decorator.accesories.Cabrio;
import com.marcinrosol.creational.decorator.accesories.CarVersionDecorator;
import com.marcinrosol.creational.decorator.accesories.Cupe;
import com.marcinrosol.creational.decorator.accesories.GranCoupe;
import com.marcinrosol.creational.decorator.carModels.CarDto;
import com.marcinrosol.creational.decorator.carModels.bmw4;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("car")
public class CarController {

    @PostMapping("create")
    public ResponseEntity<?> get(@RequestBody Car car) {
            Car c = new CarBuilder(car.getModel(),car.getMark())
                    .setColour(car.getColour())
                    .setKmPassed(car.getKmPassed())
                    .setSeats(car.getSeats())
                    .build();
        return new ResponseEntity<Car>(c, HttpStatus.OK);
    }

    @GetMapping("/all")
    public void getAll(){
        List<CarVersionDecorator> list = new ArrayList<>();


        list.add(new Cupe(new bmw4()));
        list.add(new GranCoupe(new bmw4()));
        list.add(new Cabrio(new bmw4()));
        list.stream()
                .forEach(s -> {
                    System.out.println("Model: "+s.description());
                    System.out.println("cena: "+s.price());
                    System.out.println();
                });
    }
}
