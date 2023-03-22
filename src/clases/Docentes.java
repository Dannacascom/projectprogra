
package clases;
    
import java.util.ArrayList;


public class Docentes extends Usuarios {
    private  String id,profesion;
    private ArrayList<Clases> clases = new ArrayList();
    private int sueldo;

    public Docentes() {
        super();
    }

   

    public Docentes(String id, String profesion, int sueldo, String nombre, String apellido, String username, String password, String rol) {
        super(nombre, apellido, username, password, rol);
        this.id = id;
        this.profesion = profesion;
        this.sueldo = sueldo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public ArrayList<Clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clases> clases) {
        this.clases = clases;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
