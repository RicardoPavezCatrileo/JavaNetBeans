package ejemplopolimorfismo;

import javax.swing.JOptionPane;

public class Analista extends Informaticos{
    //Utilizando Polimorfismo Overload
    public void sueldo(int horasAnalista,double pagoHAnalista,double incenAnalista){
    JOptionPane.showMessageDialog(null, "El pago es : " + (horasAnalista*pagoHAnalista) + incenAnalista);
    }
    public void datos(String nomAnalista,String apeAnalista,String dirAnalista){
    JOptionPane.showMessageDialog(null, "Nombre : " + nomAnalista + 
            "\nApellidos: " + apeAnalista + "\nDireccion: " + dirAnalista);
    }
    public void labores(String labAnalista, int horasAnalista){
    JOptionPane.showMessageDialog(null, "Soy Analista y " + 
            "Me dedico a "+ labAnalista + " " + horasAnalista + " Horas");
    }
}
