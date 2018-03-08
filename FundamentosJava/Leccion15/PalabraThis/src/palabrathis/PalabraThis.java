package palabrathis;

/**
 * Sección: 16 - Fundamentos Java: Uso de la palabra this en Java
 * 57. Ejercicio: Uso de la palabra this en Java
 * @author RicardoPavezCatrileo
 * @version V.0.0.0.1
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
    }    
}

class Persona {
    String nombre;//atributo de la clase

    Persona(String nombre) {
        this.nombre = nombre; //this es el objeto Persona (actual)

        //Imprimimos el objeto persona
        Imprimir i = new Imprimir();
        i.imprimir(this); //this es el objeto Persona (actual)
    }
}

class Imprimir {

    public void imprimir(Object o) {
        System.out.println("Imprimir parametro: " + o);//el parametro es el objeto persona
        System.out.println("Imprimir objeto actual (this): " + this); //this es el objeto imprimir (actual)
    }
}
