package Datos.DAOS;

import Clases.Personas.Administrador;
import Clases.Personas.Empleado;
import Clases.Personas.Usuario;
import Datos.ConexionBD;
import Datos.InterfacesDAOS.ILoginDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login implements ILoginDAO {
    
    @Override
    public Usuario login(String usuarioOemail, String contraseña) {
        String query = "SELECT idUsuario, nombreUsuario, tipoUsuario FROM usuario WHERE (nombreUsuario = ? OR correo = ?) and contraseña = ?";
        Connection conexion = null;
        PreparedStatement consultaPreparada = null;
        ResultSet seteo = null;
        Usuario usuario = null;

        try {
            conexion = ConexionBD.getInstancia().getConexion();  
            consultaPreparada = conexion.prepareStatement(query);
        
            consultaPreparada.setString(1, usuarioOemail);
            consultaPreparada.setString(2, usuarioOemail);
            consultaPreparada.setString(3, contraseña);
        
            seteo = consultaPreparada.executeQuery();
        
            if (seteo.next()) {
                int idUsuario = seteo.getInt("idUsuario");
                String nombre = seteo.getString("nombreUsuario");
                String tipoUsuario = seteo.getString("tipoUsuario");
                
                if (tipoUsuario.equals("Administrador")) {
                    usuario = new Administrador(nombre, usuarioOemail);
                } else {
                    usuario = new Empleado(nombre, usuarioOemail, idUsuario);
                }
            }
       
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión: " + e.getMessage());
        } finally {
            // Para que la conexion siga activa
            try {
                if (seteo != null) seteo.close();
                if (consultaPreparada != null) consultaPreparada.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        
        return usuario;
    }
}