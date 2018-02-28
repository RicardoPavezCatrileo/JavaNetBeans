package aritmetica;
/**
 *
 * @author RicardoPavezCatrileo
 */
public class PruebaAritmetica {
    public static void main (String args[]){
    //Creamos un objeto de la clase Aritmetica con el constructor vacio
        Aritmetica obj1 = new Aritmetica();
        
        //Llamamos el metodo sumar y recibimos el valor devuelto
        int resultado = obj1.sumar(5, 4);
        
        System.out.println("Resultado suma directa obj1:" + resultado);
        
        //Si llamamos directamente el metodo sumar sin argumentos
        //el valor es cero, ya que los atributos del objeto nunca se inicializaron
        //ya que no se uso el constructor con argumentos, sino el constructor vacio
        System.out.println("Resultado suma atributos obj1:" + obj1.sumar() );
        
        //Ahora creamos un objeto con el constructor con 2 argumentos
        Aritmetica obj2 = new Aritmetica(2,1);
        
        //Imprimimos directamente el resultado. 
        //Al llamar directamente al metodo suma, nos regresa el valor de la suma
        System.out.println("\nResultado suma atributos obj2:" + obj2.sumar() );
        
        //Conclusion del Ejercicio
        //* Con este Ejercicio hemos puesto en practica el manejo de constructores en Java.
        //* Los Constructores nos permiten crear nuestros objetos con valores personalizados desde el momento de la creacion, de esta manera.
        //* Un Constructores un tipo de metodo que solo se puede utilizar al momento de crear un objeto y debe llamarse igual que la clase.
    }
}
