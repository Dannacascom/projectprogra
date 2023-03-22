
package clases;

public class Registro extends Usuarios{
    private String id;

    public Registro() {
        super();
    }


    public Registro(String id, String nombre, String apellido, String username, String password, String rol) {
        super(nombre, apellido, username, password, rol);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
