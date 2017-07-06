package com.doug;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//
//        player.fullName = "Doug";
//        player.health = 20;
//        player.weapon = "Gun";
//
//        int damage = 10;
//        player.looseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.looseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Doug","Gun", 200);
        System.out.println("Initial health is " + enhancedPlayer.getHealth());

    }
}
