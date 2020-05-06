package com.marcinrosol.creational.decorator.carModels;

import com.marcinrosol.creational.decorator.CarA;

public class bmw3 extends CarA {

    @Override
    public float price() {
        return 123000F;
    }


    public String model() {
        return "E46";
    }

    @Override
    public String description() {
        return "series 3";
    }
}
