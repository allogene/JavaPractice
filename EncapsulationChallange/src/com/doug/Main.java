package com.doug;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(100, false);

        int pagesToPrint = 10;
        printer.printPages(pagesToPrint);

        pagesToPrint = 50;
        printer.printPages(pagesToPrint);

        pagesToPrint = 50;
        printer.printPages(pagesToPrint);



        int fillToner = 25;
        printer.fillToner(fillToner);

        fillToner = 40;
        printer.fillToner(fillToner);
    }
}
