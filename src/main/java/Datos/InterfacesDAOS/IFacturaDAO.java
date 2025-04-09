package Datos.InterfacesDAOS;

import java.math.BigDecimal;

/**
 *
 * @author hazky
 */
public interface IFacturaDAO {
    boolean agregarFactura(int idEmpleado, BigDecimal total, BigDecimal subtotal, BigDecimal itbis);
    boolean eliminarFactura(int idFactura);
}
