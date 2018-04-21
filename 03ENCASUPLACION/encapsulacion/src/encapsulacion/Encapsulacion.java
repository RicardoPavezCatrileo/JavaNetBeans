
package encapsulacion;

public class Encapsulacion {

    public static void main(String[] args) {
       
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno();
        
        alu1.setnoControl(12345);
        alu1.nombre="Juan";
        alu1.apellidos="Perez Lopez";
        alu1.setEmail("jhon@gmail.com");
        alu1.verDatos();
        
        System.out.println("********************");
        
         alu2.setnoControl(123456);
        alu2.nombre="Juan2";
        alu2.apellidos="Perez Lopez2";
        alu2.setEmail("jhon2@gmail.com");
        alu2.verDatos();
        
        System.out.println("No.de Control : " + alu1.getNoControl() + "que es Privado");
        
    }
    
}
