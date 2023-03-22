
package clases;

import java.util.ArrayList;


public class Alumnos extends Usuarios{
    private String cuenta,carrera;
    private ArrayList<Clases> clases = new ArrayList();

    public Alumnos() {
        super();
    }

  

    public Alumnos(String cuenta, String carrera, String nombre, String apellido, String username, String password, String rol) {
        super(nombre, apellido, username, password, rol);
        this.cuenta = cuenta;
        this.carrera = carrera;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clases> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return nombre;
    }

 
    
    
           
}
