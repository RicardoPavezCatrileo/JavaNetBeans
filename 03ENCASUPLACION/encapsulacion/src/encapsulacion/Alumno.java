package encapsulacion;

public class Alumno {
    //Atributos
    private int noControl;
    private String email;
    public String nombre,apellidos;
    
    //Creando los metodos get y set para poder acceder 
    //a nuestros atributos de tipo privado
    void setnoControl(int NC){
    this.noControl=NC;
    }
    int getNoControl(){
    return noControl;
    }
    void setEmail(String EM){
        this.email=EM;
    }
    String getEmail(){
    return email;
    }
     void verDatos(){
     System.out.println("No de Control: " + noControl);
     System.out.println("Nombre: " + nombre);
     System.out.println("Apellidos: " + apellidos);
     System.out.println("Email: " + email);
     }
    
}
