package com.doug;

/**
 * Created by Acer on 5/2/2017.
 */
public class Case {
    private String model, manufacturuer, powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturuer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturuer = manufacturuer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButoon(){
        System.out.println("Power button pressed.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturuer() {
        return manufacturuer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
