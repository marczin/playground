package com.marcinrosol.creational.decorator.accesories;

import com.marcinrosol.creational.decorator.CarA;

public class Cupe extends CarVersionDecorator{
    private CarA car;

    public Cupe(CarA car) {
        this.car = car;
    }


    @Override
    public float price() {
        return car.price() +100000F;
    }

    @Override
    public String description() {
        return car.description()+" Coupé";
    }
}
