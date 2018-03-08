package aritmetica;

/**
 *
 * @author RicardoPavezCatrileo
 */
public class Aritmetica {
    //Atributos de la clase
    int a, b;
    //constructor vacio
    Aritmetica(){}
    
    //Constructor con 2 argumentos
    Aritmetica(int arg1,int arg2){
        a=arg1;
        b=arg2;
    }
      //este metodo toma nuevos valores 
    int sumar (int a,int b){
    return a + b;
    }
    //este metodotoma los atributos de la clase
    int sumar(){
    return a+b;
    }
}