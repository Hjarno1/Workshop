package com.workshop;

public class VentilationActuator extends Actuator{

    public VentilationActuator(String name) {
        super(name, 0);
    }

    @Override
    public String toString() {
        return "com.workshop.VentilationActuator{" +
                "value=" + value +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }
}
