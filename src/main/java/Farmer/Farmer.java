


package Farmer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Farmer extends Thread implements Feeding{

    public static int feeding;
    public static double timePlaying;

    
    public Farmer(int feeding) {
        this.feeding = feeding;
    }
    
    //Contador de tiempo en el Juego
    public static void TimePlaying(){
        Timer timer = new Timer();
        TimerTask work = new TimerTask() {
            @Override
            public void run() {
                timePlaying++;
            }
        };
        timer.schedule(work, 0, 1000);
    }

    public int getFeeding() {
        return feeding;
    }

    public void setFeeding(int feeding) {
        this.feeding = feeding;
    }

    public double getTimePlaying() {
        return timePlaying;
    }

    public void setTimePlaying(int timePlaying) {
        this.timePlaying = timePlaying;
    }


    @Override
    public int feeding() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void run(){
        TimePlaying();
    }
    
}
