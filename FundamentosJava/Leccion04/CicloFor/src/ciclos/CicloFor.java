package ciclos;

import java.util.Scanner;

/**

 * @author RicardoPavezCatrileo
 */
public class CicloFor {
    public static void main(String[] args) {
        // TODO code application logic here
        //int limite = 10;
        //for (int contador = 0; contador < limite; contador++){
        //    System.out.println("contador = " + contador);
        //}
        
     System.out.println("Por favor introduce el numero de elementos a iterar");
    int maxElementos;
    Scanner entradaEscaner = new Scanner(System.in);
    maxElementos = entradaEscaner.nextInt();
    //int limite = 10;
    for (int contador = 0; contador < maxElementos ; contador++){
     System.out.println("contador = " + contador);
    }
    }
}
