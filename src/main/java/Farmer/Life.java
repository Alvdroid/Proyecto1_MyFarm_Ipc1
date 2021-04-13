


package Farmer;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Life extends Thread{
    
    public static int timeLife;
    
    public static void timeLife(int life) throws InterruptedException{
        timeLife = life;
        while (life != 0) {            
            life--;
            sleep(1000);
            timeLife = life;
        }
    }
    
    @Override
    public void run(){
        try {
            timeLife(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Life.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
