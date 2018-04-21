package getyset;

public class GetYSet {

    public static void main(String[] args) {
       Alumnos alu1 = new Alumnos(12345,"Panfilo","Gonzalez Prieto1");
       Alumnos alu2 = new Alumnos(123456789,"Rutilo","Gonzalez Prieto2");
       alu1.verDatos();
       alu2.verDatos();
       //Llamando a los metodos get
       System.out.println("Obteniendo el nombre del alumno 2 : " + alu2.getNombre());
       //Asignandole un nombre a l que antes era Rutilo
       alu2.setNombre("JULIAN");
       alu2.verDatos();
       System.out.println("Obteniendo el nombre del alumno 2, Modificado : " + alu2.getNombre());
    }
    
}
