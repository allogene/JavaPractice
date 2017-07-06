package com.doug;

/**
 * Created by Acer on 5/23/2017.
 */
public class Player {
    public String fullName, weapon;
    public int health;


    public void looseHealth(int damage){
        this.health = this.health - damage;
        if(this.health<=0){
            System.out.println("Player Dead!");
        }
    }

    public int healthRemaining(){
        return this.health;
    }

}
