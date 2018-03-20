package beans.model;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;



@Named(value = "candidato")
@RequestScoped
public class Candidato {
    public Candidato() {
    }
    private String nombre= "Escribir Nombre";
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
