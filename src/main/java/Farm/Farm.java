/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farm;

import Enums.TipoCelda;

/**
 *
 * @author alvin
 */
public class Farm {
    
    
    public static void farm(){
        
        //Inicializacion de celdas de Grama
        
        
        //Inicializacion de celdas de agua
        Water water1 = new Water();
        Water water2 = new Water();
        Water water3 = new Water();
        water1.tipoCelda(TipoCelda.AGUA);        
        water2.tipoCelda(TipoCelda.AGUA);
        water3.tipoCelda(TipoCelda.AGUA);
        water1.barco(1);
        water1.cantidadPeces();
        water2.cantidadPeces();
        
        //Inicializacion de celdas de Desierto
  }
}
