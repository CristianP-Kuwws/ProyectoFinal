package Clases.Producto;

import java.math.BigDecimal;

/**
 *
 * @author hazky
 */
public class Producto {
    
    private int idProducto;
    private String marca;
    private BigDecimal precio;
    private int stock;
    private int cantidadSeleccionada;  
    
    //Regular 
    
    public Producto(int idProducto, String marca, BigDecimal precio, int stock) {
        this.idProducto = idProducto;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }
    
    //A la hora de generar facturas
    
    public Producto(int idProducto, String marca, BigDecimal precio, int stock,  int cantidadSeleccionada) {
        this.idProducto = idProducto;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        this.cantidadSeleccionada = cantidadSeleccionada;
    }
    
    //Cuando no necesitamos el id, como por ejemplo a la hora de crearlo (autoincrementable en bd)
    
    public Producto(String marca, BigDecimal precio, int stock) {
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }
    
    // Getters 
    public int getIdProducto() {  
        return idProducto;  
    }  

   
    public String getMarca() {  
        return marca;  
    }  

  
    public BigDecimal getPrecio() {  
        return precio;  
    }  

    public int getStock() {  
        return stock;  
    }  
    
    public int getCantidadSeleccionada() {
        return cantidadSeleccionada;  // Accedemos a la cantidad seleccionada
    }
}
