package com.doug;

/**
 * Created by Acer on 5/30/2017.
 */
public class hamburger {
    private String meat, rollType;
    private double BurgerPrice, additionsSubTotal;
    private int numCondiments = 4, maxCondiments = 4;
    private  AdditionList additionItem = new AdditionList();
    private AdditionList[] additonNamesPrice = new AdditionList[6];


    public hamburger(String meat, String rollType, double price, int numCondiments, int maxCondiments) {
        this.meat = meat;
        this.rollType = rollType;
        this.BurgerPrice = price;
        this.numCondiments = numCondiments;
        this.maxCondiments = maxCondiments;
    }

    public void addCondiment(condiment Condiment) {
        addCondiment(Condiment, this.maxCondiments);
    }

    public void removeCondiment(condiment Condiment) {
        removeCondiment(Condiment, this.numCondiments);
    }

    public void addCondiment(condiment Condiment, int numCondiments) {
        if (this.numCondiments > 0) {
            System.out.println("Adding " + Condiment.getName() + " to burger @ a cost of $" + Condiment.getPrice());
            this.additionsSubTotal += Condiment.getPrice();
//            System.out.println("numCondiments value: " +  numCondiments);
//            System.out.println("this.numCondiments value: " +  this.numCondiments);
           int i = (numCondiments - this.numCondiments);
//            System.out.println("index value: " +  i);
            this.additionItem.setName(Condiment.getName());
            this.additionItem.setPrice(Condiment.getPrice());
            addAdditonNamesPrice(this.additionItem,i);
            this.numCondiments--;
        } else {
            System.out.println("Already added maximum number of condiments allowed.");
        }
    }

    public void removeCondiment(condiment Condiment, int numCondiments) {
        if (this.numCondiments < 5) {
            System.out.println("Removing " + Condiment.getName() + " to burger @ a cost of $" + Condiment.getPrice());
            this.additionsSubTotal -= Condiment.getPrice();
            this.numCondiments++;
            //TO DO: Remove from additionNamesPrice array
        } else {
            System.out.println("No condiments have been added.");
        }
    }

    public String getMeat() {
        return meat;
    }

    public String getRollType() {
        return rollType;
    }

    public double getBurgerPrice() {
        return BurgerPrice;
    }

    public int getNumCondiments() {
        return numCondiments;
    }

    public void addAdditionsSubTotal(double price) {
        this.additionsSubTotal += price;
    }

    public void removeAdditionsSubTotal(double price) {
        this.additionsSubTotal -= price;
    }

    public double getTotalPrice() {
        return additionsSubTotal + BurgerPrice;
    }

    public double getAdditionsSubTotal() {
        return additionsSubTotal;
    }

    public String printAdditonNamesPrice() {

        for (int x = 0; x < this.maxCondiments; x++){
            AdditionList tempItem;
//            System.out.println("x: " + x);
            tempItem = this.additonNamesPrice[x];
            System.out.println("Addition " + tempItem.getName() + " Price = $" + tempItem.getPrice());
        }
        return "";
    }

    public void addAdditonNamesPrice(AdditionList additionItem, int index) {
       for(int x = 0; x <= index; x++){
           AdditionList temp = this.additonNamesPrice[x];
           
       }
        System.out.println("item name: "+ additionItem.getName() + " price: " + additionItem.getPrice());
        this.additonNamesPrice[index] = additionItem;
    }
}

