
package Farm.TypePlants;

import Enums.TipoCelda;
import Enums.TipoPlantas;


public class Fruits extends Plants{

    
    
    public Fruits(String Nombre, int cantidadCosecha, int PrecioSemilla, int TiempoCosecha, TipoPlantas tipoPlanta){
        super(Nombre, cantidadCosecha, PrecioSemilla, TiempoCosecha, tipoPlanta);
        this.TiempoCosecha = TiempoCosecha;
        this.PrecioSemilla = PrecioSemilla;
        this.cantidadCosecha = cantidadCosecha;
        this.Nombre = Nombre;
    }
    
    public void ejecucionFruits() throws InterruptedException{
        cosecha();
    }
    
    public void cosecha() throws InterruptedException{
        while (TiempoCosecha>0) {            
            TiempoCosecha--;//tiempo en segundos
            TiempoCosecha = TiempoCosecha;
            Thread.sleep(TiempoCosecha*1000);
        }
    }

    @Override
    public TipoPlantas TipoPlanta(TipoPlantas tipoPlanta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
