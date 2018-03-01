package pasoporvalor;
public class PasoPorValor {
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        imprimir(x);
        cambiaValor(x);
        imprimir(x);
    }
    public static void cambiaValor (int i){
        i=200;
    }
    public static void imprimir (int arg){
        System.out.println("Valor Recibido: " + arg);
    }
}
