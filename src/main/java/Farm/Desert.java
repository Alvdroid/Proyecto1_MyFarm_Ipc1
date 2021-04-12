
package Farm;

import Enums.TipoCelda;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Desert extends Celdas{
    
    static ImageIcon imageDesert = new ImageIcon("3.png");
    protected static TipoCelda tipoCelda;
            
    public void desert(){
        tipoCelda();
        System.out.println("En este tipo de tierra no se puede hacer nada");   
    }
    
    protected void tipoCelda(){
        TipoCelda tipoCelda = null;
        tipoCelda = tipoCelda.DESIERTO;
        this.tipoCelda = tipoCelda;
    }

    public TipoCelda gettipoCelda() {
        return tipoCelda.GRAMA;
    }

    @Override
    public void generarCeldas() {
        this.setIcon(new ImageIcon(imageDesert.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
    }
}
