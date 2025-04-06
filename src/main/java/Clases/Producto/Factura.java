package Clases.Producto;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author hazky
 */
public class Factura implements Calculos {
    
    private int idFactura;
    private int idEmpleado;
    private ArrayList<Producto> listaProductos;
    
    public Factura(int idFactura, int idEmpleado) {
        this.idFactura = idFactura;
        this.idEmpleado = idEmpleado;
        listaProductos = new ArrayList();
    }
    
    //Metodos basicos
    
     public int getIdFactura() {
        return idFactura;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    
    //Metodos de Interface

    @Override
    public BigDecimal calculoTotal() {
        return calculoSubtotal().add(calculoITBIS());
    }

    @Override
    public BigDecimal calculoSubtotal() {
        BigDecimal subtotal = BigDecimal.ZERO;
        for (Producto productoInd : listaProductos) {
            subtotal = subtotal.add(productoInd.getPrecio());
        }
        return subtotal;
    }

    @Override
    public BigDecimal calculoITBIS() {
        BigDecimal subtotal = calculoSubtotal();
        BigDecimal itbis = subtotal.multiply(new BigDecimal("0.18"));
        return itbis;
    }
  
}
