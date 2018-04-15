
package ejemplopolimorfismo;

import javax.swing.JOptionPane;


public class AdministradorBD {
    //Utilizando Polimorfismo Overload
    public void sueldo(double pagoAdministradorBD){
    JOptionPane.showMessageDialog(null, "El Pago es de : " + pagoAdministradorBD);
    }
    public void datos(String nomAdministradorBD){
    JOptionPane.showMessageDialog(null, "Nombre es : " + nomAdministradorBD);
    }
    public void labores(String labAdministradorBD){
    JOptionPane.showMessageDialog(null, "Soy Administrador de BBDDs y " + 
            " Me dedico a " + labAdministradorBD);
    }
}
