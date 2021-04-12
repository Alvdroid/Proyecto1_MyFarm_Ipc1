

package Farm;


public class naada {
    
       
    
    
    
   /*
    Grama grama[] = new Grama[10];
    Water water[] = new Water[8];
    Desert desert[] = new Desert[7];
    Object celdas[] = new Object[25];
    Water gram = new Water();
    int nada =0;
    
    public void Celdas() throws InterruptedException{
        
        //Ciclo para crear las celdas de grama
        for (int i = 0; i < grama.length; i++) {
            grama[i]= gram();
        }
        //Ciclo agregar arreglo grama a arreglo Celdas
        for (int i = 0; i < 10; i++) {
            celdas[i] = grama[i];
        }
        
        
        //Ciclo para crear las celdas de agua
        for (int i = 0; i < water.length; i++) {
            water[i] = new Water();
            //water[i].gettipoCelda();
            //water[i].Water(0);
        }
        //Ciclo agregar arreglo water a arreglo Celdas
        for (int i = 10; i < 18; i++) {
            int j = 0;
            j= j++;
            celdas[i] = water[j];
        }
        
        
        //Ciclo para crear las celdas de desierto
        for (int i = 0; i < desert.length; i++) {
            desert[i] = new Desert();
            //desert[i].gettipoCelda();
            //desert[i].desert();
        }
        //Ciclo agregar arreglo desert a arreglo Celdas
        for (int i = 18; i < 25; i++) {
            int j = 0;
            j= j++;
            celdas[i] = desert[j];
        }
  }
    
    public void enviarTipoCelda() throws InterruptedException{
        Stack <Integer> Numeros = new Stack<Integer>();
        Random rdm = new Random();
        int Aleatorio; 
        for (int i = 0; i < 25; i++){
            Aleatorio = (int)(rdm.nextDouble()*25+1);
            while (Numeros.contains(Aleatorio)){                
                Aleatorio = (int)(rdm.nextDouble()*25+1);
            }
            Numeros.push(Aleatorio);
            System.out.println(celdas[i]);
        }
    }
    
    /*@Override
    public void run(){
        try {
            Celdas(nada);
        } catch (InterruptedException ex) {
            Logger.getLogger(Water.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    class marcoinicial extends JFrame{
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    public void genboton (){
        Randon randon = new Randon();
        int rad = randon.genera_numero_radon(1, 100);
        JButton boton;  
        if (rad >= 0 && rad <= 40){
            
            boton = new JButton();
            boton.setText("Grama");
            boton.setBackground(Color.green);
        }
        else if (rad > 40 && rad <=75){
            boton = new JButton();
            boton.setText("Agua");
            boton.setBackground(Color.blue);
        }
        else {
            boton = new JButton();
            boton.setText("Desierto");
            boton.setBackground(Color.yellow);
        }
        
        panel2.add (boton); */
    
    // static ImageIcon imagen1 = new ImagenIcon("Tierra.png")
    //this.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
}
