
/*
 * Derechos reservados RicardoPavezCatrileo
 */
package ejemplojavadoc;

import com.gm.javadoc.Aritmetica;

/**
 * Clase para probar el concepto de JavaDoc
 * @author RicardoPavezCatrileo
 * @version V.0.0.0.1
 */
public class EjemploJavaDoc {

    /**
     * Metodo que ejecuta la prueba de la clase Aritmetica
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        
        int resultado1 = new Aritmetica(3, 2).sumar();
        //int resultado2 = new Aritmetica(8, 6).resta();

        System.out.println("resultado:" + resultado1);
        //System.out.println("resultado:" + resultado2);
        
        
        
    }
}