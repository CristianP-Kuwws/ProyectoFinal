/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoii;

import Clases.Producto.Factura;
import Clases.Producto.GenerarFactura;
import Clases.Producto.Producto;
import Datos.ConexionBD;
import GUI.VentanaPrincipal;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Connection;
import javax.swing.UIManager;
import java.util.ArrayList;

/** 
 *
 * @author hazky
 */
public class ProyectoII {

    public static void main(String[] args) {
              
        try {
            UIManager.setLookAndFeel(new FlatMaterialLighterIJTheme());
           
        } catch (Exception e) {
            e.printStackTrace();
        }
      
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        
        System.out.println("prueba de pull elliam.");
        System.out.println("prueba de pull Eithan.");
        System.out.println("prueba de pull Eithan.");
        
        /** // Por si quieren probar la funcion de crear factura, al final de todo les dara la ruta en donde se almacena el archivo
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto(1, "Arroz", new BigDecimal("30.00"), 10));
        productos.add(new Producto(2, "Aceite", new BigDecimal("25.00"), 5));
        productos.add(new Producto(3, "Azúcar", new BigDecimal("15.00"), 3));

        Factura factura = new Factura(1001, 10); // idFactura, idEmpleado
        for (Producto p : productos) {
            factura.getListaProductos().add(p);
        }

        // Calcular valores
        BigDecimal subtotal = factura.calculoSubtotal();
        BigDecimal itbis = factura.calculoITBIS();
        BigDecimal total = factura.calculoTotal();

        // PDF
        GenerarFactura.generarFacturaPDF("facturaNew.pdf", factura.getIdFactura(), 999, productos, subtotal, itbis, total);


        **/
         
    
        
    }
}
