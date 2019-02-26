package com.company.repin;

public class CarRetailer {
    private CarBuilder carBuilder;

    public CarRetailer(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void constructCar() {
        carBuilder.createCarMaxSpeed();
        carBuilder.createEngine();
        carBuilder.createModel();
    }

    public Car getCar() {
        return carBuilder.getCar();
    }
}
