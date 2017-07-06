package com.doug;

/**
 * Created by Acer on 5/23/2017.
 */
public class Printer {
    private int tonerLevel, pagesPrinted;
    private boolean isDuplex = false;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 &&  tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }else
        {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void fillToner(int percentAmount) {
        System.out.println("Adding " + percentAmount + " to toner level.");
        if ((this.tonerLevel + percentAmount) <= 100) {
            this.tonerLevel = this.tonerLevel + percentAmount;
        }
        else
        {
            System.out.println("Adding more than 100 percent toner capacity. Toner level is 100%, " + (-1*(100 - (this.tonerLevel+percentAmount))) + "% toner remaining.");
            this.tonerLevel = 100;
        }
        System.out.println("Current toner level: " + this.tonerLevel);
    }

    public void printPages(int numPages){
        if(isEnoughToner(numPages)) {
            if (isDuplex) {
                if (numPages % 2 > 0) {
                    numPages += 1;
                }

                this.pagesPrinted += numPages / 2;
                this.tonerLevel -= numPages;
                System.out.println(numPages + " page(s) requested to print. Duplex Printer. Printing " + numPages/2 + " pages. Total pages printed: " + this.pagesPrinted +
                        " Toner remaining: " + this.tonerLevel);

            } else {
                this.pagesPrinted += numPages;
                this.tonerLevel -= numPages;
                System.out.println(numPages + " page(s) requested to print.  Total pages printed: " + this.pagesPrinted +
                        " Toner remaining: " + this.tonerLevel);
            }
        }
    }
    private boolean isEnoughToner(int amountNeeded){
        if ((this.tonerLevel - amountNeeded) <= 0){
            System.out.println("Not enough toner available to print. " +
                    "Toner remaining: " + this.tonerLevel + " Toner needed: " + amountNeeded + " Canceling print request.");
            return false;
        }
        return true;
    }
}
