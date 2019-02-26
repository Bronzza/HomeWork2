package com.company.repin;

public class Car {
    private String model;
    private Engine engine;
    private Integer maxSpeed;

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
