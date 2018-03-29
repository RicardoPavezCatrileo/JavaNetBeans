package manejogenericos;

//Definimos una clase generica con el operador diamante <>

import java.util.Arrays;

public class ClaseGenerica<T> {
    //Definimos una variable de tipo generico
    T objeto;

    //Constructor que inicializa el tipo a utilizar
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    public void obtenerTipo() {
        System.out.println("Objeto validado : "+objeto.equals(objeto));
        System.out.println("El tipo T es: " + objeto.getClass().getName());
        //System.out.println("El tipo de T es : "+ Arrays.toString(objeto.getClass().getDeclaredConstructors()));
    }
}