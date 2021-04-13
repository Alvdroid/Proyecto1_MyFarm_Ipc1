/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

/**
 *
 * @author alvin
 */
public class DatosJugador {
    
    public static String Nombre;
    public static String NickName;
    

    
    public String datos(String Nombre, String NickName){
        this.Nombre = Nombre;
        this.NickName = NickName;
        return Nombre;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String NickName) {
        this.NickName = NickName;
    }
    
    
    
}
