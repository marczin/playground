package com.marcinrosol.creational.builder.Models.builders;

import com.marcinrosol.creational.builder.Models.Car;

public class CarBuilder {
    //required
    private String model;
    private String mark;

    //optional
    private String colour;
    private Long kmPassed;
    private int seats;

    public CarBuilder(String model, String mark) {
        this.model = model;
        this.mark = mark;
    }


    public CarBuilder setColour(String colour){
        this.colour = colour;
        return this;
    }

    public CarBuilder setKmPassed(Long km){
        this.kmPassed = km;
        return this;
    }

    public CarBuilder setSeats(int seats){
        this.seats = seats;
        return this;
    }

    public Car build(){
        return new Car(this.model,this.mark,this.colour,this.kmPassed,this.seats);
    }

}
