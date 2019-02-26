package com.company.repin;

public class Engine {
    private Integer power;
    private Integer weight;

    public Engine(Integer power, Integer weight) {
        this.power = power;
        this.weight = weight;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", weight=" + weight +
                '}';
    }
}
