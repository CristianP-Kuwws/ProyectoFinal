// bajo revision
package Datos.DAOS;

import Datos.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistrarUsuario {
    
    public boolean usuarioExiste(String correo) {
        String query = "SELECT COUNT(*) FROM usuario WHERE correo = ?";
        try (Connection conexion = ConexionBD.getInstancia().getConexion();
             PreparedStatement consultaPreparada = conexion.prepareStatement(query)) {
            
            consultaPreparada.setString(1, correo);
            ResultSet resultado = consultaPreparada.executeQuery();
            
            if (resultado.next()) {
                return resultado.getInt(1) > 0; // true si hay al menos un usuario con ese correo
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar el usuario: " + e.getMessage());
        }
        return false;
    }
    
    public boolean registrarUsuario(String nombre, String correo, String contraseña) {
        if (usuarioExiste(correo)) {
            System.out.println("El correo ya está registrado.");
            return false;
        }

        String query = "INSERT INTO usuario (nombreUsuario, correo, contraseña, tipoUsuario) VALUES (?, ?, ?, 'Empleado')";
        try (Connection conexion = ConexionBD.getInstancia().getConexion();
             PreparedStatement consultaPreparada = conexion.prepareStatement(query)) {
            
            consultaPreparada.setString(1, nombre);
            consultaPreparada.setString(2, correo);
            consultaPreparada.setString(3, contraseña);
            
            int filasAfectadas = consultaPreparada.executeUpdate();
            return filasAfectadas > 0; // Retorna true si se registro correctamente
            
        } catch (SQLException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
        }
        
        return false;
    }
}