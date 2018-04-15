
package ejemplopolimorfismoOverride;

import javax.swing.JOptionPane;

public class ProgramadorOverride extends InformaticosOverride {
    
    @Override
    public void sueldo(double pagoProgramador){
    JOptionPane.showMessageDialog(null,"El Pago de un Programador es $" + pagoProgramador);
    }
     @Override
    public void datos (String nombreProgramador){
    JOptionPane.showMessageDialog(null,"El Nombre de un Programador es $" + nombreProgramador);
    }
     @Override
    public void labores(String laboresProgramador){
    JOptionPane.showMessageDialog(null,"Las labores de un Programador es $" + laboresProgramador);
    }
}
