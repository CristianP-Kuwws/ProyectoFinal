package Datos.DAOS;

import Datos.ConexionBD;
import Datos.InterfacesDAOS.IFacturaDAO;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hazky
 */

public class GestionFacturaBD implements IFacturaDAO {

    @Override
    public Integer agregarFacturaYObtenerID(int idEmpleado, BigDecimal total, BigDecimal subtotal, BigDecimal itbis, String idcliente) {
        String query = "INSERT INTO Factura (idEmpleado, total, subtotal, itbis, idcliente) VALUES (?, ?, ?, ?, ?)";

        try (Connection conexion = ConexionBD.getInstancia().getConexion(); PreparedStatement consultaPrep = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            consultaPrep.setInt(1, idEmpleado);
            consultaPrep.setBigDecimal(2, total);
            consultaPrep.setBigDecimal(3, subtotal);
            consultaPrep.setBigDecimal(4, itbis);
            consultaPrep.setString(5, idcliente);

            int filas = consultaPrep.executeUpdate();

            if (filas > 0) {
                ResultSet rs = consultaPrep.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al agregar factura: " + e.getMessage());
        }

        return null;
    }
    
    @Override
    public boolean eliminarFactura(int idFactura) {
        String query = "DELETE FROM Factura WHERE idFactura = ?";

        try (Connection conexion = ConexionBD.getInstancia().getConexion(); PreparedStatement consultaPrep = conexion.prepareStatement(query)) {

            consultaPrep.setInt(1, idFactura);
            int filas = consultaPrep.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al agregar factura: " + e.getMessage());
            return false;
        }
    }
    
}
