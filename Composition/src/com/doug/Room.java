package com.doug;

/**
 * Created by Acer on 5/3/2017.
 */
public class Room {
    private String name, flooring;
    private int walls;
    public Wall wall1;

    public Room(String name, String flooring, int walls, Wall wall1) {
        this.name = name;
        this.flooring = flooring;
        this.walls = walls;
        this.wall1 = wall1;
    }

    public String getName() {
        return name;
    }

    public String getFlooring() {
        return flooring;
    }

    public int getWalls() {
        return walls;
    }

    public Wall getWall1() {
        return wall1;
    }
}