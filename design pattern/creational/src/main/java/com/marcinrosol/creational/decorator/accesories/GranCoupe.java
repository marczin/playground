package com.marcinrosol.creational.decorator.accesories;

import com.marcinrosol.creational.decorator.CarA;

public class GranCoupe extends CarVersionDecorator{
    private CarA car;

    public GranCoupe(CarA car) {
        this.car = car;
    }

    @Override
    public float price() {
        return car.price()+150000F;
    }

    @Override
    public String description() {
        return car.description() + " Gran Cupé";
    }
}
