package datos;

public class ImplementacionOracle implements AccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde ImplementecionOracle Implements AccesoDatos");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde ImplementecionOracle Implements AccesoDatos");
    }

}