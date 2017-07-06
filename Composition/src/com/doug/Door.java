package com.doug;

/**
 * Created by Acer on 5/4/2017.
 */
public class Door {
    private String name, color, style;
    private int posX, posY;

    public Door(String name, String color, String style, int posX, int posY) {
        this.name = name;
        this.color = color;
        this.style = style;
        this.posX = posX;
        this.posY = posY;
    }

    public void setPercentOpen(int openPercent) {
        if (openPercent == 0) {
            System.out.println("Door is closed.");
        } else {
            System.out.println("Door is " + openPercent + " percent opened.");
        }

    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}

