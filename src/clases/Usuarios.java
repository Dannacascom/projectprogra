
package clases;
 

public class Usuarios {
    protected String nombre,apellido,username,password,rol;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String username, String password, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "nombre=;" + nombre + " apellido:" + apellido + " username:" + username + " password:" + password + " rol:" + rol;
    }
    
    
}
