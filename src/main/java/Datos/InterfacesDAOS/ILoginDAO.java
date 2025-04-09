package Datos.InterfacesDAOS;

import Clases.Personas.Usuario;

/**
 *
 * @author hazky
 */
public interface ILoginDAO {
    Usuario login(String usuarioOemail, String contraseña);
}
