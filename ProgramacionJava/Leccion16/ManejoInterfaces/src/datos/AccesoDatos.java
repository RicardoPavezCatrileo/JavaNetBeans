package datos;

public interface AccesoDatos {
    
    //declaracion de constante
    public static int MAX_REGISTROS = 100;

    public abstract void insertar();
    
    public abstract void listar();
    
}