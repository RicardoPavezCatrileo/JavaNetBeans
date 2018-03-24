
import javax.swing.JOptionPane;


public class EjemploHerenciaN3 {

    public static void main(String[] args) {
        String nom,tel,dir;
        double suel;
        int ed;
        nom=JOptionPane.showInputDialog(null,"Ingrese el Nombre del Empleado : ","Solicitando Datos : ",3);
        ed=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad del Empleado : ","Solicitando Datos : ",3));
        suel=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el sueldo del Empleado : ","Solicitando Datos : ",3));
        tel=JOptionPane.showInputDialog(null,"Ingrese el telefono del Empleado : ","Solicitando Datos : ",3);
        dir=JOptionPane.showInputDialog(null,"Ingrese la direccion del Empleado : ","Solicitando Datos : ",3);
        
        Empleado emp1= new Empleado(nom,ed,suel,tel,dir);
        Empleado emp2= new Empleado("Ricardo Pavez",25,7000,"987654321","Patroclo 912");
        Empleado emp3= new Empleado("Juventino Torres",17,1000,"987654321","Patroclo 944");
        emp1.verDatos();
        emp2.verDatos();
        emp3.verDatos();
        
        
        
        
    }
    
    
}
