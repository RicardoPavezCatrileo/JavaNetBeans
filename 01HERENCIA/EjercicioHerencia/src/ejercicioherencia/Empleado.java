package ejercicioherencia;

public class Empleado extends Persona {
    
    double sueldo;
    String Telefono,direccion;
    
    public Empleado(String nom,int ed,double suel,String tel, String dir){
     super(nom,ed);
     this.direccion=dir;
     this.sueldo=suel;
     this.Telefono=tel;
    }
    
    @Override
    public void verDatos(){
     
    }  
    
}
