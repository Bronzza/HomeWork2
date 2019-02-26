package com.company.repin;

public class FerrariCarBuilder extends CarBuilder {
    @Override
    public void createModel() {
        getCar().setModel("Ferrari");
    }

    @Override
    public void createEngine() {
        getCar().setEngine(new Engine(420, 310));

    }

    @Override
    public void createCarMaxSpeed() {
        getCar().setMaxSpeed(380);
    }
}
