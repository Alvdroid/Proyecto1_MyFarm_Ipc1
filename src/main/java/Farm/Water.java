
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
    Scanner scan = new Scanner(System.in);
    
    static ImageIcon imageWater = new ImageIcon("2.png");
    protected TipoCelda tipoCelda;
    protected int barco;
    protected int cantidadPeces = 0;
    private static int numeroCelda;
    
    @Override
    public void generarCeldas() {
        this.setIcon(new ImageIcon(imageWater.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
    }
     protected void tipoCelda(){
        TipoCelda tipoCelda = null;
        tipoCelda = tipoCelda.AGUA;
        this.tipoCelda = tipoCelda;
    }
        
    
    public void Water() throws InterruptedException{
        
        tipoCelda();
        Water.numeroCelda++;
        //while(this.barco!=0){
            int respuesta = 0;
            System.out.println("\nCelda de agua numero " + numeroCelda);
            System.out.println("¿Desea agregar un barco?");
            System.out.println("El maximo de barcos por celda es '1' ");
            System.out.println("Precio del barco: Q100");
            System.out.println("1) Si \n2) No");
            respuesta = scan.nextInt();
                switch(respuesta){
                    case 1:
                        System.out.println("Agregando barco...");
                        sleep(numeroCelda*2000);
                        Oro oro = new Oro();
                        oro.oro();
                        
                        System.out.println("Barco agregado");
                        this.barco = 1;
                        cantidadPeces();
                        break;
                    case 2:
                        System.out.println("Ningun barco agregado");
                        break;
                    default:
                        System.out.println("Solo numeros '1' y '2'");
          //      }
        }
    }

    
    public int barco(int barco){
        this.barco = barco;
        
        return barco;
    }
    
    
    public void cantidadPeces() throws InterruptedException{
        int cantidadPeces = 10;
        this.cantidadPeces = cantidadPeces;
        System.out.println("La celda de agua contiene un maximo de 10 peces");
        
        if (this.barco==1) {
            
           for (int i = 0; cantidadPeces >= i; cantidadPeces--) {
            System.out.println("Actualmente la celda de agua numero " + numeroCelda + " contiene " + cantidadPeces + " peces");
            sleep(cantidadPeces*3000);
            this.cantidadPeces = cantidadPeces;
            
                if (cantidadPeces == 0){
                    System.out.println("Se elimino al barco de la celda para que crezcan peces");
                    setBarco(0);
                    System.out.println("Ahora tiene " +getBarco() + " barcos" );
                } 
            }
        
        }
        else {
            System.out.println("La celda esta llena de peces");
            
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