package ejemplopolimorfismo;
import javax.swing.JOptionPane;

public class Programador extends Informaticos{
    //Utilizando Polimorfismo Overload
    public void sueldo(int horasProgramador,double pagoHProgramador){
    JOptionPane.showMessageDialog(null, "El pago es : " + 
            (horasProgramador*pagoHProgramador));
    }
    public void datos(String nombreProgramador ,String apellidoProgramador){
    JOptionPane.showMessageDialog(null, "Nombre : " + nombreProgramador + 
            "\nApellidos: " + apellidoProgramador);
    }
    public void labores(String labProgramador){
    JOptionPane.showMessageDialog(null, "Soy Programador y" + 
            "Me dedicoa " + labProgramador);
    }
}
