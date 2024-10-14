package com.qriosity.day10.constructor;

/**
 * @author Queue-ri
 */
public class Car2 {
    String model;
    String color;
    int maxSpeed;

    public Car2(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void speedUp() {
        System.out.println("속도 UP!");
    }

    @Override
    public String toString() {
        return "Car2{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
