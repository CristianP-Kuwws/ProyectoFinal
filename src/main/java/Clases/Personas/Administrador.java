package Clases.Personas;

import GUI.VentanaAdmin;

/**
 *
 * @author hazky
 */
public class Administrador extends Usuario {

    public Administrador(String nombre, String correo, String contrasenia) {
        super(nombre, correo, contrasenia);
    }

    //Constructor especifico para no complicar el uso de la BD
    public Administrador(String nombre, String correo) {
        super(nombre, correo);
    }

    @Override
    public void mostrarInterfaz() {
        VentanaAdmin ventanaAdmin = new VentanaAdmin();
        ventanaAdmin.setVisible(true);
    }

}
