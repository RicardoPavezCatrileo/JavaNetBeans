package aritmetica;
/**
 *
 * @author RicardoPavezCatrileo
 */
public class PruebaAritmetica {
    public static void main (String args[]){
    //creamos un opbjeto de la clase aritmetica
    Aritmetica a = new Aritmetica();
    
    //llamamos el metodo sumar y recibimos el valor devuelto
    int resultado = a.sumar(5,3);
    System.out.println("resultado es "+ resultado);
    
    }
}
