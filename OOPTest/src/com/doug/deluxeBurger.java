package com.doug;

/**
 * Created by Acer on 6/2/2017.
 */
public class deluxeBurger extends hamburger {

    drink soda = new drink("Coke","Soda",1.99,true);
    sideItem chips = new sideItem("Dorittos","Chips",0.75,true);

    public deluxeBurger(String meat, double price) {
        super(meat, "White Bun", price, 0, 2);

        AdditionList additionItem = new AdditionList();

        additionItem.setName(this.soda.getName());
        additionItem.setPrice(this.soda.getPrice());
        addAdditonNamesPrice(additionItem,0);
        additionItem.setName(this.chips.getName());
        additionItem.setPrice(this.chips.getPrice());
        addAdditonNamesPrice(additionItem,1);

        printAdditonNamesPrice();
    }






    public double getAdditionsSubTotal(){
        return soda.getPrice() + chips.getPrice();
    }

}
