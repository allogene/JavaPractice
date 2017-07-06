package com.doug;

class Car{
    private String make, model, year;
    private int doors, cylinders, wheels, gears;
    public int speed;
    private boolean isManual, hasEngine;

    public Car(String make, String model, String year, int doors, int cylinders, int gears, boolean isManual) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.doors = doors;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.gears = gears;
        this.isManual = isManual;
        this.hasEngine = true;
    }

    public String startEngine() {
        if(hasEngine){
            return "Engine started.";
        }
        else{
            return "Car has no engine, cannot start.";
        }
    }

    public String accelerate(int velocity){
        return "Accelerating";
    }

    public String brake(int velocity){
        return "Braking";
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public int getDoors() {
        return doors;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }
}

class Camry extends Car{

    public Camry(){
        super("Toyota","Camry","2005",4,3,5,false);
    }

    @Override
    public String accelerate(int velocity){
        if (velocity > 0) {
            this.speed += velocity;
            return("Car accelerate to " + velocity + " mphs.");
        }
        else{
            return "Car is stopped.";
        }
    }

    @Override
    public String brake(int velocity){
        if (velocity > 0) {
            this.speed -= velocity;
            if(speed < 0){
                speed = 0;
            }
            return ("Camry braked by " + velocity + " to " + speed + " mphs.");
        }
        else{
            return ("Invalid velocity " + velocity + " Velocity must be a positive integer for Camry to brake");
        }
    }
}

class SantaFe extends Car{

    public SantaFe(){
        super("Hyundai","Santa Fe","2015",4,3,5,false);
    }

    @Override
    public String accelerate(int velocity){
        if (velocity > 0) {
            this.speed += velocity;
            return("Car accelerate to " + velocity + " mphs.");
        }
        else{
            return "Car is stopped.";
        }
    }

    @Override
    public String brake(int velocity){
        if (velocity > 0) {
            this.speed -= velocity;
            if(speed < 0){
                speed = 0;
            }
            return ("SantaFe braked by " + velocity + " to " + speed + " mphs.");
        }
        else{
            return ("Invalid velocity " + velocity + " Velocity must be a positive integer for SantaFe to brake.");
        }
    }
}

class Civic extends Car{

    public Civic(){
        super("Honda","Civic","2017",4,3,5,true);
    }

    @Override
    public String accelerate(int velocity){
        if (velocity > 0) {
            this.speed += velocity;
            return("Car accelerate to " + velocity + " mphs.");
        }
        else{
            return "Car is stopped.";
        }
    }

    @Override
    public String brake(int velocity){
        if (velocity > 0) {
            this.speed -= velocity;
            if(speed < 0){
                speed = 0;
            }
            return (getClass().getSimpleName() +" braked by " + velocity + " to " + speed + " mphs.");
        }
        else{
            return ("Invalid velocity " + velocity + " Velocity must be a positive integer for Civivcto brake.");
        }
    }
}

class Pinto extends Car {

    public Pinto() {
        super("Ford", "Pinto", "1975", 2, 3, 5, true);
    }
}

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + ": " + car.getMake() + " " + car.getModel() );
            System.out.println(car.accelerate(10));
            System.out.println(car.brake(15)+ "\n");
        }
    }

    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 4) + 1;
        System.out.println("Random number generated was: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Camry();
            case 2:
                return new SantaFe();
            case 3:
                return new Civic();
            case 4:
                return new Pinto();
        }

        return null;

    }

}
