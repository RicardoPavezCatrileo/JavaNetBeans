/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

/**
 *
 * @author qa-ntb
 */
public class Persona {
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;
    
    //constructor vacio
    public Persona(){}
    
    //constructor 1 argumento
    public Persona(String nombre){
    this.nombre = nombre;
    }
    public Persona (String nombre,char genero,int edada,String direccion){
    this.nombre=nombre;
    this.genero=genero;//M-masculino,F-Femenino
    }
}
