package com.marcinrosol.creational.controller;

import com.marcinrosol.creational.builder.Models.Car;
import com.marcinrosol.creational.builder.Models.builders.CarBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
