package abstracto.domain;

public class Triangulo extends FiguraGeometrica {

    public Triangulo(String TF) {
        super(TF);
    }

    public void dibujar() {
        //Implementacion del metodo dibujar heredado de la clase FiguraGeometrica
        System.out.println("Aqui­ deberia dibujar un:" + this.getClass().getSimpleName());
    }
}