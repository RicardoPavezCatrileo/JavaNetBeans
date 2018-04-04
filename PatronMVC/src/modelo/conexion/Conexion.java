package modelo.conexion;
import java.sql.*;
/**
 * Clase que permite conectar con la base de datos
 * @author chenao - Modificaciones RicardoPavez
 */
public class Conexion {
   static String bd = "codejavu";
   static String login = "root";
   static String password = "admin";//se agrega clave de base de datos local
   static String url = "jdbc:mysql://localhost/"+bd;
   Connection conn = null;
   /** Constructor de DbConnection */
   public Conexion() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexion
         conn = DriverManager.getConnection(url,login,password);
         if (conn!=null){
            System.out.println("CONECCION A BASE DE DATOS"+bd+" OK");
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   /**Permite retornar la conexi�n*/
   public Connection getConnection(){
      return conn;
   }
   public void desconectar(){
      conn = null;
   }
}