package datos;

public class ImplementacionMySql implements AccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde ImplementacionMySql Implements Accedatos");
    }

    @Override
    public void listar() {
           System.out.println("Listar desde ImplementacionMySql Implements Accedatos");
    }
    
}