package com.doug;

/**
 * Created by Acer on 5/23/2017.
 */
public class EnhancedPlayer {
    private String name, weapon;
    private int hitpoints = 100;

    public EnhancedPlayer(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if(health >0 && health <= 100) {
            this.hitpoints = health;
        }
    }

    public void looseHealth(int damage){
        this.hitpoints = this.hitpoints - damage;
        if(this.hitpoints <=0){
            System.out.println("Player Dead!");
        }
    }

    public int getHealth() {
        return hitpoints;
    }
}
