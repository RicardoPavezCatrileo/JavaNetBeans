package ejemplovarargs;

public class EjemploVarArgs {

    public static void main(String[] args) {
        //Imprimimos varios numeros
        imprimirNumeros(15,20,3,61,75,18,10);
        //f(15.1,20.3,21.2);
        
        System.out.println("");
        imprimirNumerosForEach(151,201,31,611,751,181,101);
        
        System.out.println("");
        variosParametros("Juan", true, 15,20,14);        
    }
    
    public static void imprimirNumeros(int... numeros){
        //Recorremos cada elemento
        int elemento;
        for(int i=0; i < numeros.length; i++){
            elemento = numeros[i];
            System.out.println("Elemento " + i + ": " + elemento);
        }   
    }
    /*public static void imprimirFloat(float...f){
        int elemento2;
        for(int i=0; i < f.length; i++){
            System.out.println((f[i]);
            System.out.println("Elemento " + i + ": " + elemento2);
        }  
    }*/    
    public static void imprimirNumerosForEach(int... numeros){
        //Usamos un forEach en lugar de un for normal
        for(int numero : numeros){
            System.out.println("El numero es:" + numero );
        }
    }
    
    
    public static void variosParametros(String name, boolean logic, int... numerbs){
        System.out.println("Nombre: " + name);
        
        System.out.println("Valido: " + logic);
        
        
        //Usamos un forEach
        for(int i : numerbs){
            System.out.println("El numero es:" + i );
        }
        
       
    }
}