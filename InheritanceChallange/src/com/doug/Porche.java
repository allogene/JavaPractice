package com.doug;

/**
 * Created by Acer on 4/28/2017.
 */
public class Porche extends Car {
    private int turbo = 0, airFoil;

    public Porche(String name, int wheels, String model, int gears, int turbo, int airFoil) {
        super(name, wheels, model, gears);
        this.turbo = turbo;
        this.airFoil = airFoil;
    }

    public void turbo(){
        if(turbo > 0){
            System.out.println("Porche.turbo called. Speed =  100 Gear = 5");
          accelerate(100, 5);
        }
    }

}
