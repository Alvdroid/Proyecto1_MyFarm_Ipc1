/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farm.TypePlants;

import Enums.TipoCelda;
import Enums.TipoPlantas;
import Farm.Grama;

/**
 *
 * @author alvin
 */
public abstract class Plants extends Grama{
    
    protected String Nombre;
    protected int cantidadCosecha;
    protected int PrecioSemilla;
    protected int TiempoCosecha;
    protected TipoPlantas tipoPlanta;
            
    public Plants(String Nombre, int cantidadCosecha, int PrecioSemilla, int TiempoCosecha, TipoPlantas tipoPlanta) {
        this.Nombre = Nombre;
        this.cantidadCosecha = cantidadCosecha;
        this.PrecioSemilla = PrecioSemilla;
        this.TiempoCosecha = TiempoCosecha;
        this.tipoPlanta = tipoPlanta;
    }
    
    public abstract TipoPlantas TipoPlanta(TipoPlantas tipoPlanta);
}
