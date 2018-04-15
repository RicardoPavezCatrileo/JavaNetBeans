package ejemplopolimorfismo;

public class EjemploPolimorfismo {

    public static void main(String[] args) {
     Programador p1 = new Programador();
     Analista an1 = new Analista();
     AdministradorBD adm1 = new AdministradorBD();
     
     
     p1.datos("Juan","Perez");
     p1.sueldo(24,100);
     p1.labores("Programacion");
     
     an1.datos("Julian", "Lopez", "El capulin 33 ");
     an1.sueldo(24, 100, 10);
     an1.labores("Analizar Datos", 8);
     
     adm1.datos("Jose");
     adm1.sueldo(4500);
     adm1.labores("Admin BD");
     
    }
    
}
