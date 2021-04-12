
package Farm;

import Enums.TipoCelda;
import Enums.TipoPlantas;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Grama extends Celdas{
    
    static ImageIcon imageGrama = new ImageIcon("1.png");
    
   @Override
    public void generarCeldas() {
        this.setIcon(new ImageIcon(imageGrama.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
    }
   
}
