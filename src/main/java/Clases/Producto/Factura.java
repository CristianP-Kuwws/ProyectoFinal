package Clases.Producto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author hazky
 */
public class Factura implements Calculos {
    
    private int idFactura;
    private int idEmpleado;
    private ArrayList<Producto> listaProductos;
    private LocalDate fecha;

    public Factura(int idFactura, int idEmpleado) {
        this.idFactura = idFactura;
        this.idEmpleado = idEmpleado;
        listaProductos = new ArrayList();
        this.fecha = LocalDate.now(); 
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
    
    public LocalDate getFecha() {
        return fecha;
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
            BigDecimal totalPorProducto = productoInd.getPrecio().multiply(BigDecimal.valueOf(productoInd.getCantidadSeleccionada()));
            subtotal = subtotal.add(totalPorProducto);
        }
        return subtotal;
    }

    @Override
    public BigDecimal calculoITBIS() {
        BigDecimal subtotal = calculoSubtotal();
        BigDecimal itbis = subtotal.multiply(new BigDecimal("0.18"));
        return itbis;
    }
    
    public void exportarComoPDF(String nombreArchivo, String cedulaCliente, String nombreCliente) {
    GenerarFactura.generarFacturaPDF(nombreArchivo, nombreCliente, idFactura, cedulaCliente, listaProductos, idEmpleado, calculoSubtotal(), calculoITBIS(), calculoTotal());
    }
  
}
