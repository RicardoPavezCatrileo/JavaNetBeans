package palabrareturn;

/**
 * Fundamentos Java: Uso de la palabra return en Java
 * 54. Ejercicio: Return usando Tipos Primitivos
 * @author RicardoPavezCatrileo
 * @version V.0.0.0.1
 */
public class PalabraReturn {
    public static void main(String[] args) {
        int resultado = sumar(3,6);
        System.out.println("Resultado:" + resultado);
    }
    
    //public static int sumar(int a, int b){
    //    return a + b;
    //}
    public static int sumar(int a, int b){
        if(a== 0 && b == 0){
            System.out.println("Puede proporcionar valores distintos a cero");
            return 0;
        }
               
        return a + b;
    }
}
