
package Farm;

import Enums.TipoCelda;

public class Water extends Cells{
    
    
    protected int barco;
    protected int cantidadPeces = 0;
    
    @Override
    public void tipoCelda(TipoCelda tipoCelda){
        this.tipoCelda = tipoCelda;
    }
    
    public void barco(int barco){
        barco = this.barco;
    }
    
    public void cantidadPeces(){
        int cantidadPeces = 10;
        this.cantidadPeces = cantidadPeces;
        System.out.println("La celda contiene un maximo de 10 peces");
        for (int i = 0; cantidadPeces >= i; cantidadPeces--) {
            System.out.println("Actualmente la celda contiene " + cantidadPeces);
            this.cantidadPeces = cantidadPeces;
        }
    }
}