//SuperClase
//Una Clase Abstracta contiene al menos un metodo que no ha sido
//especificado, es decir, este sera heredado para sobreescribirse
//Haciendo la clase abstracta para evitar que sea instanciada
public abstract class Persona {
    String nombre;
    int edad;
    
    //Metodo Constructor con dos parametros
    public Persona(String nom,int ed){
        this.nombre=nom;
        this.edad=ed;
    }
    //Creando el Metodo Abstracto
    abstract public void verDatos();
}
