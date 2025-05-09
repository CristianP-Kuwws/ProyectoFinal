package Clases.Personas;

import GUI.ventanaProductos;

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

    //Constructor especifico para no complicar el uso de la BD
    public Empleado(String nombre, String correo, int idEmpleado) {
        super(nombre, correo);
        this.idEmpleado = idEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    @Override
    public void mostrarInterfaz() {
        ventanaProductos ventanaProductos = new ventanaProductos();
        ventanaProductos.setVisible(true);
    }

}
