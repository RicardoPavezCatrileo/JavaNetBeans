package ejercicio_ficheros;
//Video Sacado desde el siguiente Link https://www.youtube.com/watch?v=AAo7E_0-d8A
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class Ejercicio_Ficheros {

    public static void main(String[] args) throws IOException {
        try {
            FileInputStream f = new FileInputStream("C:\\Users\\qa-ntb\\Downloads\\datos.xlsx");
            XSSFWorkbook libro = new XSSFWorkbook(f);
            XSSFSheet hoja = libro.getSheetAt(0);
            Iterator<Row> filas = hoja.iterator();
            Iterator<Cell> celdas;
            Row fila;
            Cell celda;
            while (filas.hasNext()) {
                fila = filas.next();
                celdas = fila.cellIterator();
                while (celdas.hasNext()) {
                    celda = celdas.next();
                    switch (celda.getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.println(celda.getNumericCellValue());
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.println(celda.getNumericCellValue());
                            break;
                    }
                }
            }
        } 
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
