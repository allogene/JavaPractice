package com.doug;

/**
 * Created by Acer on 6/2/2017.
 */
public class drink {

    private String name, type;
    private double price;
    private boolean isIncluded;

    public drink(String name, String type, double price, boolean isIncluded) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.isIncluded = isIncluded;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {

        if(isIncluded){
            return 0.00;
        }else {
            return price;
        }
    }

    public boolean isIncluded() {
        return isIncluded;
    }
}
