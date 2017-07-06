package com.doug;

public class Main {

    public static void main(String[] args) {


        condiment mustard = new condiment("Mustard","Yellow mustard",0.25);
        condiment ketchup = new condiment("Ketchup","Tomato puree with spices",0.25);
        condiment cheese = new condiment("Cheese","Cheddar cheese",0.50);
        condiment bacon = new condiment("Bacon","Applewood smoked center cut bacon",1.00);

        hamburger basic = new hamburger("Beef","White Bun",5.99,4,4);

        basic.addCondiment(bacon);
        basic.addCondiment(mustard);
        basic.addCondiment(ketchup);
        basic.addCondiment(cheese);
        basic.addCondiment(bacon);

        System.out.println("Burger total = $" + basic.getBurgerPrice() + "\n" +
                "Additions total = $" + basic.getAdditionsSubTotal() + " \n" +
                "Order total = $" + basic.getTotalPrice()+ "\n" +
                basic.printAdditonNamesPrice());

        healthyBurger healthy = new healthyBurger("turkey",6.99);

        healthy.addCondiment(bacon);
        healthy.addCondiment(mustard);
        healthy.addCondiment(ketchup);
        healthy.addCondiment(cheese);
        healthy.addCondiment(bacon);
        healthy.addCondiment(bacon);
        healthy.addCondiment(bacon);

        System.out.println("Burger total = $" + healthy.getBurgerPrice() +"\n" +
                            "Additions total = $" + healthy.getAdditionsSubTotal() + " \n" +
                            "Order total = $" + healthy.getTotalPrice()+ "\n" +
                            healthy.printAdditonNamesPrice());

        deluxeBurger deluxe = new deluxeBurger("beef",9.99);

        deluxe.addCondiment(bacon);
        deluxe.addCondiment(mustard);
        deluxe.addCondiment(ketchup);
        deluxe.addCondiment(cheese);
        deluxe.addCondiment(bacon);
        deluxe.addCondiment(bacon);
        deluxe.addCondiment(bacon);

        System.out.println("Burger total = $" + deluxe.getBurgerPrice() +"\n" +
                "Additions total = $" + deluxe.getAdditionsSubTotal() + "\n" +
                "Order total = $" + deluxe.getTotalPrice() + "\n" +
                deluxe.printAdditonNamesPrice());
    }
}
