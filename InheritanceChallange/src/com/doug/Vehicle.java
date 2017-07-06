package com.doug;

/**
 * Created by Acer on 4/28/2017.
 */
public class Vehicle {

    private String name;
    private int engine, body, wheels;

    public Vehicle(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
        this.body = 1;
        this.engine = 1;
    }

    public void move(int speed){
        System.out.println("Vehicle.move called. Vehicle speed = " + speed);
    }

    public String getName() {
        return name;
    }

    public int getEngine() {
        return engine;
    }

    public int getBody() {
        return body;
    }

    public int getWheels() {
        return wheels;
    }
}
