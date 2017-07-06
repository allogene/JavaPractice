package com.doug;

/**
 * Created by Acer on 5/4/2017.
 */
public class Window {
    private String name, style;
    private int posX, posY;

    public Window(String name, String style, int posX, int posY) {
        this.name = name;
        this.style = style;
        this.posX = posX;
        this.posY = posY;
    }

    public void setPercentOpen(int openPercent) {
        if (openPercent == 0) {
            System.out.println("Window is closed.");
        } else {
            System.out.println("Window is " + openPercent + " percent opened.");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
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
}
