

package Farm;

import Enums.TipoCelda;
import Enums.TipoPlantas;
import java.util.Scanner;
import Farm.TypePlants.*;

public abstract class Farm extends Thread{
    
    protected TipoPlantas tipoPlanta;
    int precioSemilla;
    int TiempoCosecha;
    int cantidadCosecha;
    int eleccion;
    TipoPlantas tipoPlantas;
    String nombre;
    
    public void Farm() throws InterruptedException{
    
    }
}
