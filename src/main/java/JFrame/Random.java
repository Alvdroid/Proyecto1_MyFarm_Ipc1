
package JFrame;


public class Random {
    public int genera_random(int minimo, int maximo) {

        int random = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return random;

    }
    
}
