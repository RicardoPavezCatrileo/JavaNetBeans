package sentenciascontrol;

/**
 *
 * @author RicardoPavezCatrileo
 * @version v.0.0.0.1
 */
public class CalculaMesSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes = 14; // Mes del año
        String estacion;

        String saludo = "Hola Mundo";
        
        switch(mes){
            case 1:case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10 : case 11:
                estacion = "Otoño";
                break;
            default:
            estacion = "Mes incorrecto";
        }
        System.out.println("La estacion para el mes " + mes + " es: " + estacion);
    }
}
