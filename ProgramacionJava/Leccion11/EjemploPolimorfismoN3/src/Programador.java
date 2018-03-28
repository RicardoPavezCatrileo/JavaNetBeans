
import javax.swing.JOptionPane;

public class Programador extends Informaticos {
    //Utilizando Polimorfismo Overload
    public void sueldo (int horas,double pagoH){
        JOptionPane.showMessageDialog(null,"El pago es: " + (horas*pagoH));
    
    }
     public void datos (String nom,String ape){
        JOptionPane.showMessageDialog(null,"Nombre: " + nom + "\nApellidos: " + ape);
    
    }
     public void labores(String lab){
       JOptionPane.showMessageDialog(null,"Soy Programador y " + "Me dedido a "+ lab);
     }
}
