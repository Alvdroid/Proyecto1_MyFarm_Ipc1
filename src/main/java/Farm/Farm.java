

package Farm;

import Enums.TipoCelda;
import Enums.TipoPlantas;
import java.util.Scanner;
import Farm.TypePlants.*;

public abstract class Farm extends Thread{
    
    protected TipoPlantas tipoPlanta;
    Water water = new Water();
    Scanner scan = new Scanner(System.in);
    int precioSemilla;
    int TiempoCosecha;
    int cantidadCosecha;
    int eleccion;
    TipoPlantas tipoPlantas;
    String nombre;
    
    public void Farm() throws InterruptedException{
        
        water.Water();
        System.out.println("Ingrese el nombre de la planta");
        nombre = scan.next();
        System.out.println("Ingrese el precio de la semilla");
        precioSemilla = scan.nextInt();
        System.out.println("Ingrese la cantidad de cosecha que produce la planta");
        cantidadCosecha = scan.nextInt();
        System.out.println("Ingrese el tiempo de cosecha (segundos)");
        TiempoCosecha = scan.nextInt();
        System.out.println("Elija tipo de planta");
        System.out.println("1) Tipo Grano \n2) Tipo Fruta");
        eleccion = scan.nextInt();
        switch(eleccion){
            case 1:
                tipoPlanta = tipoPlanta.GRANO;
                //Grain grain = new Grain(precioSemilla, TiempoCosecha, tipoPlanta, nombre, cantidadCosecha);
                //grain.ejecucionGrain();
                break;
            default:
                tipoPlanta = tipoPlanta.FRUTAS;
                //Fruits fruits = new Fruits(precioSemilla, TiempoCosecha, tipoPlanta, nombre, cantidadCosecha);
                //fruits.ejecucionFruits();
        }
        
            
    }
}
