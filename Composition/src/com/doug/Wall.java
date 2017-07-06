package com.doug;

/**
 * Created by Acer on 5/3/2017.
 */
public class Wall {
    private int numWindows, numColors, numDoors;
    private String directionName, colors, pattern;
    private Door door;
    private Window window;

    public Wall(int numWindows, int numColors, int numDoors, String directionName, String colors, String pattern, Door door, Window window) {
        this.numWindows = numWindows;
        this.numColors = numColors;
        this.numDoors = numDoors;
        this.directionName = directionName;
        this.colors = colors;
        this.pattern = pattern;
        this.door = door;
        this.window = window;
    }

    public void paintWall(int numColors, String colors, String pattern) {
        System.out.println("Painting the " + this.directionName + " wall with " + numColors + " color(s). The color(s) chosen: " + colors +
                ". The wall will be painted with a " + pattern + " pattern.");
    }

    public void openDoor(int percentOpen){
        System.out.println("Wall -> Open Door");
        door.setPercentOpen(percentOpen);

    }

    public int getNumWindows() {
        return numWindows;
    }

    public int getNumColors() {
        return numColors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public String getDirectionName() {
        return directionName;
    }

    public String getColors() {
        return colors;
    }

    public String getPattern() {
        return pattern;
    }

    public Door getDoor() {
        return door;
    }

    public Window getWindow() {
        return window;
    }
}
