package com.marcinrosol.creational.builder.Models;

public class Car {
    //required
    private String model;
    private String mark;

    //optional
    private String colour;
    private Long kmPassed;
    private int seats;

    public Car(){}

    public Car(String model, String mark) {
        this.model = model;
        this.mark = mark;

    }
    public Car(String model, String mark, String colour, Long kmPassed, int seats) {
        this.model = model;
        this.mark = mark;
        this.colour = colour;
        this.kmPassed = kmPassed;
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public String getColour() {
        return colour;
    }

    public Long getKmPassed() {
        return kmPassed;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", colour='" + colour + '\'' +
                ", kmPassed=" + kmPassed +
                ", seats=" + seats +
                '}';
    }
}
