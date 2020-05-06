package com.marcinrosol.creational.decorator.accesories;

import com.marcinrosol.creational.decorator.CarA;

public class Cabrio extends CarVersionDecorator{

    private CarA car;

    public Cabrio(CarA car) {
        this.car = car;
    }

    @Override
    public float price() {
        return car.price() + 200000F;
    }

    @Override
    public String description() {
        return car.description()+ " cabrio";
    }
}
