
package Farm;
import java.util.Scanner;
import Enums.TipoCelda;

public class Water extends Thread{
    Scanner scan = new Scanner(System.in);
    
    protected TipoCelda tipoCelda;
    protected int barco;
    protected int cantidadPeces = 0;
    private static int numeroCelda;
    
    
     protected void tipoCelda(){
        Water.numeroCelda++;
        TipoCelda tipoCelda = null;
        tipoCelda = tipoCelda.AGUA;
        this.tipoCelda = tipoCelda;
    }
        
    
    public void agregandoBarco() throws InterruptedException{
        int respuesta = 0;
        System.out.println("\nCelda de agua numero " + numeroCelda);
        System.out.println("¿Desea agregar un barco?");
        System.out.println("El maximo de barcos por celda es '1' ");
        System.out.println("Precio del barco: Q100");
        System.out.println("1) Si \n2) No");
        respuesta = scan.nextInt();
            switch(respuesta){
                case 1:
                    this.sleep(numeroCelda*2000);
                    System.out.println("Barco agregado");
                    barco = 1;
                    break;
                default:
                    System.out.println("Solo numeros '1' y '2'");
            }
    }
    
    
    public int barco(int barco){
        this.barco = barco;
        
        return barco;
    }
    
    
    public void cantidadPeces() throws InterruptedException{
        int cantidadPeces = 10;
        this.cantidadPeces = cantidadPeces;
        System.out.println("La celda contiene un maximo de 10 peces");
        if (this.barco==1) {
           for (int i = 0; cantidadPeces >= i; cantidadPeces--) {
            System.out.println("Actualmente la celda numero " + this.numeroCelda + " contiene " + cantidadPeces + " peces");
            this.sleep(cantidadPeces*5000);
            this.cantidadPeces = cantidadPeces;
                if (cantidadPeces == 0){
                    System.out.println("Se elimino al barco de la celda para que crezcan peces");
                    setBarco(0);
                    System.out.println("Ahora tiene " +getBarco() + " barcos" );
                } 
            }
        
        }
        if (this.barco==0) {
            System.out.println("La celda esta llena de paces");
            
        }
    }
    
    
    public int getBarco() {
        return barco;
    }

    public void setBarco(int barco) {
        this.barco = barco;
    }
    
    
    
    
    
    @Override
    public void run(){
        tipoCelda();
    }
}