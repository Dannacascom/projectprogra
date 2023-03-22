
package clases;

public class Clases {
 private String id,nombre,hora,semestre,periodo,año;
 private int uv;

    public Clases() {
    }

    public Clases(String id, String nombre, String hora, String semestre, String periodo, String año, int uv) {
        this.id = id;
        this.nombre = nombre;
        this.hora = hora;
        this.semestre = semestre;
        this.periodo = periodo;
        this.año = año;
        this.uv = uv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    @Override
    public String toString() {
        return nombre;
    }
 
 
}
