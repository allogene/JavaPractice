package com.doug;

/**
 * Created by Acer on 5/2/2017.
 */
public class PC  {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp(){
        theCase.pressPowerButoon();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixalAt(1200,50,"yellow");
    }


}
