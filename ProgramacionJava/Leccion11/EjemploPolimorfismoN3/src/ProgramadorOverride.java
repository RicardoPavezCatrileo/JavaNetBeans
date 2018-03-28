
import javax.swing.JOptionPane;
public class ProgramadorOverride extends InformaticosOverride{
    
    /**
     *
     * @param pago
     */
    @Override
    public void sueldo(double pago){
        JOptionPane.showMessageDialog(null,"El paso de un programador es $ " +  pago);
    }
     @Override
    public void datos(String nombre){
        JOptionPane.showMessageDialog(null,"El nombre del programador es: " +  nombre);
    }
     @Override
    public void labores(String labor){
        JOptionPane.showMessageDialog(null,"las labores del programador son " +  labor);
    }
    
     
    
}
