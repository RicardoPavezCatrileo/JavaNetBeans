
package variablespolimorficas;
//SubClase

import javax.swing.JOptionPane;

public class Pesimista extends Personalidad{
    
     @Override
    public void hablar(){
    JOptionPane.showMessageDialog(null,"Seguro que hoy tendre un "
            + "pesimo dia", "Que Pesimista Soy",1);
    }
    
}
