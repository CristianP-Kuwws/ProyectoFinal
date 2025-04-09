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
    
    // Los metodos del DAOS fueron implementados, entonces esto es innecesario?
    
   
    public void actualizarMarca(String nuevaMarca) {
        if (nuevaMarca == null || nuevaMarca.trim().isEmpty()) {
            throw new IllegalArgumentException("La marca no puede estar vacía.");  
        } 
        this.marca = nuevaMarca;  
        
        // Implementar una funcion que ejecute una actualizacion en la Base de datos.
        
    }
    
    public void actualizarStock(int nuevoStock) {
        
        if (nuevoStock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.stock = nuevoStock;
    
        // Implementar una funcion que ejecute una actualizacion en la Base de datos.
   
    }

    public void actualizarPrecio(BigDecimal nuevoPrecio) {
        if (nuevoPrecio.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = nuevoPrecio;
        
        // Implementar una funcion que ejecute una actualizacion en la Base de datos.
    }
    
    

}
