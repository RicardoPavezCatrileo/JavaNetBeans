/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author qa-ntb
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
