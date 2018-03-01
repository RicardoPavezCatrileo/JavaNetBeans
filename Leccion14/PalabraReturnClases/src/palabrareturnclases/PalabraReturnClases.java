package palabrareturnclases;

/**
 * Sección: 15 - Fundamentos Java: Uso de la palabra return en Java
 * 55. Ejercicio: Return usando Tipos Object
 * @author RicardoPavezCatrileo
 * @version V.0.0.0.1
 */
public class PalabraReturnClases {

    public static void main(String args[]) {
        Suma s = creaObjetoSuma();
        int resultado = s.a + s.b;
        System.out.println("Resultado:" + resultado);
    }

    public static Suma creaObjetoSuma() {
        Suma s = new Suma(3, 4);
        return s;
    }
}

class Suma {
    int a;
    int b;

    Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }
}