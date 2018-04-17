
package variablespolimorficas;

//SubClase

import javax.swing.JOptionPane;

public class Extrovertido extends Personalidad{
    
     @Override
    public void hablar(){
    JOptionPane.showMessageDialog(null,"Hola que gusto verte"
            + "Ya te extrañaba, no sabes que bien me ha ido..."
            , "Soy Extrovertido y hablo hasta siempre",1);
    }
    
}
