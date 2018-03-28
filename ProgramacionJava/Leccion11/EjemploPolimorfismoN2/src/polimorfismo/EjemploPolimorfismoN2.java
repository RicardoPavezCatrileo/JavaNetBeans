package polimorfismo;
import animales.*;
public class EjemploPolimorfismoN2 {

    public static void main(String[] args) {
        Animal a; 
        a = new Gato();
        test (a);
        
        a = new Perro();
        test(a);
        
        Animal animales[]= new Animal[2];
        animales[0] = new Gato();
        animales[0] = new Perro();
              
    }
    public static void test(Animal animal){
    animal.hacerRuido();
    }
    
}
