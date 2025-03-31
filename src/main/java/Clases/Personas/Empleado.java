package Clases.Personas;

/**
 *
 * @author hazky
 */
public class Empleado extends Usuario {
    
    private int idEmpleado; 
    
    public Empleado(String nombre, String correo, String contrasenia, int idEmpleado) {
        super(nombre, correo, contrasenia);
        this.idEmpleado = idEmpleado;
    }
    
    public int getIdEmpleado() {  
        return idEmpleado;  
    }  
    
}
