
import javax.swing.JOptionPane;


public class AdministradorBDOverride extends InformaticosOverride {
    
    
     @Override
    public void sueldo(double pago){
        JOptionPane.showMessageDialog(null,"El paso de un AdministradorBD es $ " +  pago);
    }
     @Override
    public void datos(String nombre){
        JOptionPane.showMessageDialog(null,"El nombre del AdministradorBD es: " +  nombre);
    }
     @Override
    public void labores(String labor){
        JOptionPane.showMessageDialog(null,"las labores del AdministradorBD son " +  labor);
    }
}
