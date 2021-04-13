
package Farm;
import java.util.Scanner;
import Enums.TipoCelda;
import java.util.logging.Level;
import java.util.logging.Logger;
import Oro.*;
import java.awt.Image;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;

public class Water extends Celdas{
    
    static ImageIcon imageWater = new ImageIcon("2.png");
    protected TipoCelda tipoCelda;
    protected int barco;
    protected int cantidadPeces = 0;
    private static int numeroCelda;
    
    @Override
    public void GenerarCeldas() {
        this.setIcon(new ImageIcon(imageWater.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
    }
     protected void tipoCelda(){
        TipoCelda tipoCelda = null;
        tipoCelda = tipoCelda.AGUA;
        this.tipoCelda = tipoCelda;
    }
        
    
    public void Water() throws InterruptedException{
        
        tipoCelda();
        cantidadPeces();
    }

    
    public int barco(int barco){
        this.barco = barco;
        
        return barco;
    }
    
    
    public void cantidadPeces() throws InterruptedException{
        int cantidadPeces = 10;
        this.cantidadPeces = cantidadPeces;
        this.barco=1;
        
        //Ciclo para disminuir los peces
        if (this.barco==1) {
           for (int i = 0; cantidadPeces >= i; cantidadPeces--) {
            sleep(cantidadPeces*700);
            this.cantidadPeces = cantidadPeces;
                if (cantidadPeces == 0){
                    Productos.contadorAlimento = Productos.contadorAlimento +10;
                    setBarco(0);//Eliminar el barco
                } 
            }
        }
    }
    
    
    public int getBarco() {
        return barco;
    }

    public void setBarco(int barco) {
        this.barco = barco;
    }
    
    public TipoCelda gettipoCelda() {
        return tipoCelda.AGUA;
    }
    
    
    public void run(){
        try {
            Water();
        } catch (InterruptedException ex) {
            Logger.getLogger(Water.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    /*private void setIcon(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    
}