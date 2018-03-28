
import javax.swing.JOptionPane;


public class AnalistaOverride extends InformaticosOverride {
    
     @Override
    public void sueldo(double pago){
        JOptionPane.showMessageDialog(null,"El paso de un analista es $ " +  pago);
    }
     @Override
    public void datos(String nombre){
        JOptionPane.showMessageDialog(null,"El nombre del analista es: " +  nombre);
    }
     @Override
    public void labores(String labor){
        JOptionPane.showMessageDialog(null,"las labores del analista son " +  labor);
    }
    
}
