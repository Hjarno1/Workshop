package com.workshop;

public class Actuator extends Unit{

    double value;

    public Actuator(String name, double value) {
        super(name);
        this.value = value;

    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
