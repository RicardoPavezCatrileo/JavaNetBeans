package getyset;


public class Alumnos {
    //Atributos
    int noControl;
    String nombre, apellidos;
    //Creando metodo Constructor
    Alumnos(int nC, String nom,String ape){
    //Inicializando los atributos 
    //noControl = nC;
    //nombre = nom;
    //apellidos = ape;
    //Otra Fomra
    this.noControl=nC;
    this.nombre=nom;
    this.apellidos=ape;
    }
    //Metodos
    void verDatos(){
    System.out.println("No. Control: " + noControl);
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellidos: " + apellidos);
    }
    //Creando lls metodos get and set
    int getControl(){
        return this.noControl;
    }
    String getNombre(){
        return this.nombre;
    }
    String getApellidos(){
        return this.apellidos;
    }
    void setControl(int NC){
        this.noControl=NC;
    }
    void setNombre(String NOM){
        this.nombre=NOM;
    }
    void setApellidos(String APE){
        this.apellidos=APE;
    }
    
}
