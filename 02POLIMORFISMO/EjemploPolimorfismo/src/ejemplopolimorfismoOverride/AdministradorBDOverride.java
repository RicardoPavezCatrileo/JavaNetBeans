
package ejemplopolimorfismoOverride;

import javax.swing.JOptionPane;


public class AdministradorBDOverride extends InformaticosOverride{
    
    @Override
    public void sueldo(double pagoAdministradorBD){
    JOptionPane.showMessageDialog(null,"El Pago de un Admin es $" + pagoAdministradorBD);
    }
     @Override
    public void datos (String datosAdministradorBD){
    JOptionPane.showMessageDialog(null,"El Nombre de un Admin es" + datosAdministradorBD);
    }
     @Override
    public void labores(String laborAdministradorBD){
    JOptionPane.showMessageDialog(null,"Las labores de un Admin son" + laborAdministradorBD);
    } 
}
