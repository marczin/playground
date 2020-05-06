package com.marcinrosol.creational.decorator.carModels;

import com.marcinrosol.creational.decorator.CarA;

public class bmw4 extends CarA {
    @Override
    public float price() {
        return 200000F;
    }

    @Override
    public String description() {
        return "bmw serii 4";
    }
}
