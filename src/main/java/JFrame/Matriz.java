
package JFrame;

import Farm.Celdas;
import Farm.Desert;
import Farm.Grama;
import Farm.Texto;
import Farm.Water;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Matriz extends JFrame{
    int g = 10;
    int w = 8;
    int d = 7;
    int rows = 5;
    int columns = 5;
    NewJFrame l = new NewJFrame();
    JPanel jPanel1 = new JPanel();
    Celdas[][] Cuadrado;
    
    public void MatrizCuadrado(){
        int posicionX = 100;
        int posicionY = 70;
        Cuadrado = new Celdas[rows][columns];
        
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                generarCelda(i,j);
                Cuadrado[i][j].setBounds(posicionX, posicionY, 80, 80);
                Cuadrado[i][j].GenerarCeldas();
                this.getContentPane().add(jPanel1);
                jPanel1.add(Cuadrado[i][j]);
                posicionX+=90;
            }
            posicionX=100;
            posicionY+=90;
        }
    }
    
    private void generarCelda(int i, int j){
  
        
        int aleatorio = ((int)(Math.random()*100)+1);
        if (aleatorio>60 && aleatorio <= 100) {
            if (w != 0) {
            Cuadrado[i][j] = new Water();
                Cuadrado[i][j].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicjed(java.awt.event.MouseEvent event){
                    Texto label = new Texto("Hola");
                    l.setVisible(true);
                }
            });
            w--;
            }
            else if (g != 0){
            Cuadrado[i][j] = new Grama();
            g--;
            }
            else if (d != 0){
            Cuadrado[i][j] = new Desert();
            d--;
            }
            else {
                
            }
        }
        else if (aleatorio>25 && aleatorio <= 60) {
            if (g != 0){
            Cuadrado[i][j] = new Grama();
            g--;
            }
            else if (w != 0) {
            Cuadrado[i][j] = new Water();
            w--;
            }
            else if (d != 0){
            Cuadrado[i][j] = new Desert();
            d--;
            }
            else {
                
            }
        }
        else if (aleatorio>0 && aleatorio <= 25) {
            if (d != 0){
            Cuadrado[i][j] = new Desert();
            d--;
            }
            else if (w != 0) {
            Cuadrado[i][j] = new Water();
            w--;
            }
            else if (g != 0){
            Cuadrado[i][j] = new Grama();
            g--;
            }
            else {
                
            }
        }
    }
}