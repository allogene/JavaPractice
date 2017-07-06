package com.doug;

/**
 * Created by Acer on 4/28/2017.
 */
public class Car extends Vehicle {

    private String model;
    private int gears;

    public Car(String name, int wheels, String model, int gears) {
        super(name, wheels);
        this.model = model;
        this.gears = gears;
    }

    public void changingGears(int gear){
        System.out.println("Car.changingGears called. Gear = " + gear);
        if(gear > gears || gear < 0){
            System.out.println("invalid gear entered " + getName() + " only has " + gears + ". Specified " + gear);
        }
    }

    public void accelerate (int speed, int gear){
        System.out.println("Car.accelerate called. Speed = " + speed + " Gear = " + gear);
        changingGears(gear);
        super.move((speed));
    }

    public void brake (int speed, int gear){
        System.out.println("Car.brake called. Speed = " + speed + " Gear = " + gear);
        changingGears(gear);
        super.move((speed));
    }
}
