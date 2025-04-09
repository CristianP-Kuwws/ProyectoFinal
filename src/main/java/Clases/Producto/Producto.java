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
    
    public Producto(int idProducto, String marca, BigDecimal precio, int stock) {
        this.idProducto = idProducto;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }
    
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
}
