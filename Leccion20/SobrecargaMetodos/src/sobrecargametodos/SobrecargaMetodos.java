/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargametodos;

/**
 *
 * @author qa-ntb
 */

    public class SobrecargaMetodos {

    public static void main(String[] args) {
        System.out.println("Resultado 1: " + Operaciones.sumar(3, 4));

        System.out.println("Resultado 2: " + Operaciones.sumar(5, 4.1));

        System.out.println("Resultado 3: " + Operaciones.sumar(7.1, 3));

        System.out.println("Resultado 4: " + Operaciones.sumar(2.2, 6.8));

        //¿Cual metodo se manda llamar?
        System.out.println("Resultado 5: " + Operaciones.sumar(3, 1L));//la  L o l es de long

        //¿Cual metodo se manda llamar?
        System.out.println("Resultado 6: " + Operaciones.sumar(3F, 'A'));//La F o f es de Float
    }

}
