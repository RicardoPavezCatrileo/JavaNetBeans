package com.gm.javadoc;
/**
 * Esta clase permite realizar operaciones de aritmetica como sumar, restar, etc
 *
 * @author: RicardoPavezCa
 * @version: V.0.0.0.1
 */
public class Aritmetica {
    /**
     * Primer Operando
     */
    int operandoA;
    /**
     * Segundo operando
     */
    int operandoB;
    /**
     * Constructor de la clase
     * @param a Recibe el valor para el operando A
     * @param b Reciboe el valor para el operando B
     */
    public Aritmetica(int a, int b) {
        this.operandoA = a;
        this.operandoB = b;
    }
    
    /**
     * Este metodo realiza la suma de dos operandos enteros
     * @return int resultado de la suma 
     */
    public int sumar(){
        return operandoA + operandoB;
    }
    /**
     * Este metodo realiza la resta de dos operandos enteros
     * @return int resultado de la resta 
     */
    public int resta(){
        return operandoA + operandoB;
    }
}
