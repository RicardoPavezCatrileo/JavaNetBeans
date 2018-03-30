
package entradadatosn3;

import javax.swing.*;

public class EntradaDatosN3 {
    
    public static void main(String[] args){
    
        String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
        String edad=JOptionPane.showInputDialog("Introduce la edad, por favor");
        System.out.println("Hola" + nombre_usuario + ". Tienes " + edad"años");
        //JOptionPane.showMessageDialog("Hola" + nombre_usuario + ". Tienes " + edad + "años");
        //https://www.youtube.com/watch?v=F_48qh3BcDs&index=15&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk 10:54
    }
}
