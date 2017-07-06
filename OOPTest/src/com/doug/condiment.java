package com.doug;

/**
 * Created by Acer on 5/30/2017.
 */
public class condiment {
    private String name, desc;
    private double price;

    public condiment(String name, String desc, double price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }



    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price;
    }
}
