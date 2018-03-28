
import javax.swing.JOptionPane;


public class EjemploPolimorfismoN3 {

    public static void main(String[] args) {
       Programador p1 = new Programador();
       Analista an1 = new Analista(); 
       AdministradorBD admbd1 = new AdministradorBD();
       
       ProgramadorOverride p2 = new ProgramadorOverride();
       AnalistaOverride an2 = new AnalistaOverride();
       AdministradorBDOverride admbd2 = new AdministradorBDOverride();
       
       JOptionPane.showMessageDialog(null,"aqui comienza polimorfismo Overload");
       p1.datos("Juan","Perez");
       p1.sueldo(24, 100);
       p1.labores("Programar");
       
       an1.datos("Julian", "Lopez", "El Capulin #33");
       an1.sueldo(24, 100, 1000);
       an1.labores("Analizar Datos ", 8);
       
       admbd1.datos("Jose");
       admbd1.sueldo(4500);
       admbd1.labores("Administrar la BD");
       
       JOptionPane.showMessageDialog(null,"aqui comienza polimorfismo Override");
       
       p2.datos("Pedro");
       p2.sueldo(25000);
       p2.labores("Programar en Serio");
       
       an2.datos("Panfila");
       an2.sueldo(4000);
       an2.labores("Analizar datos en serio");
       
       admbd2.datos("Gelasio");
       admbd2.sueldo(2000);
       admbd2.labores("Administrar la BD en serio");
       
    
}
}
