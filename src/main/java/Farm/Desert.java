
package Farm;

import Enums.TipoCelda;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Desert extends Celdas{
    
    //agregando imagen a variable
    static ImageIcon imageDesert = new ImageIcon("3.png");
    protected static TipoCelda tipoCelda;
    
    //inicializando el metodo tipoCelda
    public void desert(){
        tipoCelda();  
    }
    
    //Diciendo que tipo de Celda es
    protected void tipoCelda(){
        TipoCelda tipoCelda = null;
        tipoCelda = tipoCelda.DESIERTO;
        this.tipoCelda = tipoCelda;
    }

        
    public TipoCelda gettipoCelda() {
        return tipoCelda.DESIERTO;
    }
    
    //sobre escribe e implementa la clase GenerarCelda
    @Override
    public void GenerarCeldas() {
        this.setIcon(new ImageIcon(imageDesert.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
    }
}
