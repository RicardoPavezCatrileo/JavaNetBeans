package ejemplopolimorfismo;

import javax.swing.JOptionPane;
import ejemplopolimorfismoOverride.*;

public class EjemploPolimorfismo {

    public static void main(String[] args) {
     Programador p1 = new Programador();
     Analista an1 = new Analista();
     AdministradorBD adm1 = new AdministradorBD();
     
     ProgramadorOverride p2 = new ProgramadorOverride();
     AnalistaOverride an2 = new AnalistaOverride();
     AdministradorBDOverride adm2 = new AdministradorBDOverride();
     
     JOptionPane.showMessageDialog(null,"Aqui Comienza Polimorfismo Overload");
     
     p1.datos("Juan","Perez");
     p1.sueldo(24,100);
     p1.labores("Programacion");
     
     an1.datos("Julian", "Lopez", "El capulin 33 ");
     an1.sueldo(24, 100, 10);
     an1.labores("Analizar Datos", 8);
     
     adm1.datos("Jose");
     adm1.sueldo(4500);
     adm1.labores("Admin BD");
     
      JOptionPane.showMessageDialog(null,"Aqui Comienza Polimorfismo Override");
      p2.datos("Pedro");
      p2.sueldo(2500);
      p2.labores("Programar en JAVA");
      
      an2.datos("Ricardo");
      an2.sueldo(40000);
      an2.labores("Analizar Datos en JAVA");
      
      adm2.datos("Joaquin");
      adm2.sueldo(20000);
      adm2.labores("Admin enserio");
      
     
     
    }
    
}
