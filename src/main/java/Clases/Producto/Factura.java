package Clases.Producto;

import java.util.ArrayList;

/**
 *
 * @author hazky
 */
public class Factura implements Calculos {
    
    private int idFactura ;
    private int idEmpleado ;
    private ArrayList<Producto> listaProductos;
    
    public Factura(int idFactura, int idEmpleado) {
        this.idFactura = idFactura;
        this.idEmpleado = idEmpleado;
        listaProductos = new ArrayList();
    }
    
    //Metodos basicos, abierto a posible implementacion en cuanto a termino de lista segun futuras necesidades
    
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
    public void calculoTotal() {
        //Esperando implementacion
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void calculoSubtotal() {
        //Esperando implementacion
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void calculoITBIS() {
        //Esperando implementacion
        throw new UnsupportedOperationException("Not supported yet."); 
    }
  
}
