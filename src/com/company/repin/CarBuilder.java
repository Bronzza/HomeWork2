package com.company.repin;

abstract class CarBuilder {
    private Car car;

    public Car getCar() {
        return car;
    }

    public abstract void createModel();

    public abstract void createEngine();

    public abstract void createCarMaxSpeed();

    public CarBuilder() {
        car = new Car();
    }
}
