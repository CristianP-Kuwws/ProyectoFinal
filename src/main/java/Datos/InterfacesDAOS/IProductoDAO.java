package Datos.InterfacesDAOS;

import Clases.Producto.Producto;

/**
 *
 * @author hazky
 */
public interface IProductoDAO {
    boolean agregarProducto(Producto producto);
    boolean editarProducto(Producto producto);
    boolean eliminarProducto(int idproducto);
}

