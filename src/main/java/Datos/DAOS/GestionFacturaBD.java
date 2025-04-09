package Datos.DAOS;

import Datos.ConexionBD;
import Datos.InterfacesDAOS.IFacturaDAO;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author hazky
 */
//SOLO PARA HISTORIAL DE FACTURAS
public class GestionFacturaBD implements IFacturaDAO {

    //la fecha es automaticamente generada por la bd 
    @Override
    public boolean agregarFactura(int idEmpleado, BigDecimal total, BigDecimal subtotal, BigDecimal itbis) {
        String query = "INSERT INTO Factura (idEmpleado, total, subtotal, itbis) VALUES (?, ?, ?, ?)";

        try (Connection conexion = ConexionBD.getInstancia().getConexion(); PreparedStatement consultaPrep = conexion.prepareStatement(query)) {

            consultaPrep.setInt(1, idEmpleado);
            consultaPrep.setBigDecimal(2, total);
            consultaPrep.setBigDecimal(3, subtotal);
            consultaPrep.setBigDecimal(4, itbis);

            int filas = consultaPrep.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al agregar factura: " + e.getMessage());
            return false;
        }
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
