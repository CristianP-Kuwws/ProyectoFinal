package Clases.Personas;

/**
 *
 * @author hazky
 */
public abstract class Usuario {

    private String nombre;
    private String correo;
    private String contrasenia;

    public Usuario(String nombre, String correo, String contrasenia) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia; // Puede ser null
    }

    //Constructor especifico para no complicar el uso de la BD
    public Usuario(String nombre, String correo) {
        this(nombre, correo, null);
    }

    // Getter para el nombre  
    public String getNombre() {
        return nombre;
    }

    // Getter para el correo  
    public String getCorreo() {
        return correo;
    }

    // Getter para la contrasenia  
    public String getContrasenia() {
        return contrasenia;
    }

    public abstract void mostrarInterfaz();
}
