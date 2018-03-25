package ejemploclasesabstractas;

import abstracto.domain.*;

public class EjemploClasesAbstractas {

    public static void main(String args[]) {

        //Creacion de objetos
        FiguraGeometrica rect_angulo = new Rectangulo("Rectangulo");
        FiguraGeometrica tri_angulo = new Triangulo("Triangulo");
        FiguraGeometrica cir_culo = new Circulo("Circulo");

        System.out.println(rect_angulo);
        rect_angulo.dibujar();

        System.out.println("");
        System.out.println(tri_angulo);
        tri_angulo.dibujar();

        System.out.println("");
        System.out.println(cir_culo);
        cir_culo.dibujar();

    }
}