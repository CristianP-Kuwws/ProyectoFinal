package Datos.InterfacesDAOS;

import java.math.BigDecimal;

/**
 *
 * @author hazky
 */
public interface IFacturaDAO {

    Integer agregarFacturaYObtenerID(int idEmpleado, BigDecimal total, BigDecimal subtotal, BigDecimal itbis, String cedulaCliente);

    boolean eliminarFactura(int idFactura);

}
