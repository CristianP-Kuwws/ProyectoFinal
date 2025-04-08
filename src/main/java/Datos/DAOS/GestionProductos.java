package Datos.DAOS;

import Clases.Producto.Producto;
import Datos.ConexionBD;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hazky
 */
public class GestionProductos {

    private boolean productoExiste(String marca, Connection conexion) {
        String query = "SELECT COUNT(*) FROM productos WHERE marca = ?";
        try (PreparedStatement consulta = conexion.prepareStatement(query)) {
            consulta.setString(1, marca);
            ResultSet resultado = consulta.executeQuery();
            return resultado.next() && resultado.getInt(1) > 0;
        } catch (SQLException e) {
            System.out.println("Error al verificar existencia del producto: " + e.getMessage());
            return false;
        }
    }

    public boolean agregarProducto(Producto producto) {
        String query = "INSERT INTO productos (marca, precio, stock) VALUES (?, ?, ?)";

        try (Connection conexion = ConexionBD.getInstancia().getConexion()) {
            if (productoExiste(producto.getMarca(), conexion)) {
                System.out.println("Ya existe un producto con esa marca.");
                return false;
            }

            try (PreparedStatement consultaPrep = conexion.prepareStatement(query)) {
                consultaPrep.setString(1, producto.getMarca());
                consultaPrep.setBigDecimal(2, producto.getPrecio());
                consultaPrep.setInt(3, producto.getStock());

                return consultaPrep.executeUpdate() > 0;
            }

        } catch (SQLException e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
            return false;
        }
    }

    public boolean editarProducto(Producto producto) {
        String query = "UPDATE productos SET marca = ?, precio = ?, stock = ? WHERE idproductos = ?";

        try (Connection conexion = ConexionBD.getInstancia().getConexion(); PreparedStatement consultaPrep = conexion.prepareStatement(query)) {

            consultaPrep.setString(1, producto.getMarca());
            consultaPrep.setBigDecimal(2, producto.getPrecio());
            consultaPrep.setInt(3, producto.getStock());
            consultaPrep.setInt(4, producto.getIdProducto()); // Asegurate de tener el idProducto en el objeto Producto

            return consultaPrep.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al editar producto: " + e.getMessage());
            return false;
        }
    }

    // Elimina un producto por su ID
    public boolean eliminarProducto(int idproducto) { 
        String query = "DELETE FROM productos WHERE idproductos = ?";

        try (Connection conexion = ConexionBD.getInstancia().getConexion(); PreparedStatement consultaPrep = conexion.prepareStatement(query)) {

            consultaPrep.setInt(1, idproducto);
            return consultaPrep.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e.getMessage());
            return false;
        }
    }

}

