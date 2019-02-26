package com.company.repin;

public class BmwCarBuilder extends CarBuilder {

    @Override
    public void createModel() {
        getCar().setModel("BMW");
    }

    @Override
    public void createEngine() {
        getCar().setEngine(new Engine(250, 100));
    }

    @Override
    public void createCarMaxSpeed() {
        getCar().setMaxSpeed(280);
    }
}
