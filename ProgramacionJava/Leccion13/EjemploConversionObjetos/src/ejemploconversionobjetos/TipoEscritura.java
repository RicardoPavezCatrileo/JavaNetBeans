package ejemploconversionobjetos;

public enum TipoEscritura {

    CLASICO("Escritura a Mano"),
    MODERNO("Escritura digital");

    //constante
    private final String descripcion;

    private TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

}