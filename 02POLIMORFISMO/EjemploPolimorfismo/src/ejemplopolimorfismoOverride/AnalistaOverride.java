package ejemplopolimorfismoOverride;

import javax.swing.JOptionPane;

public class AnalistaOverride extends InformaticosOverride{
     @Override
    public void sueldo(double pagoAnalista){
    JOptionPane.showMessageDialog(null,"El Pago de un Analista es $" + pagoAnalista);
    }
     @Override
    public void datos (String nombreAnalista){
    JOptionPane.showMessageDialog(null,"El Nombre de un Analista es $" + nombreAnalista);
    }
     @Override
    public void labores(String laboresAnalista){
    JOptionPane.showMessageDialog(null,"Las labores de un Analista es $" + laboresAnalista);
    }
}
