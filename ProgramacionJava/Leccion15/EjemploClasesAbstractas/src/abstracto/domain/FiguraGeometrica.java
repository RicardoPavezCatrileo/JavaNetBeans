package abstracto.domain;

public abstract class FiguraGeometrica {

    protected String tipoFigura;

    protected FiguraGeometrica(String TF){
        this.tipoFigura = TF;
    }
    //La clase padre no define comportamiento
    //Un método se declara como abstracto porque en ese momento 
    //(en esa clase) no se conoce cómo va a ser su implementación.
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String TF) {
        this.tipoFigura = TF;
    }

    public String toString() {
        return "Tipo de Figura: " + this.tipoFigura;
    }
}
