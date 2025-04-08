/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoii;


import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme; //este me gusta mucho
import Datos.ConexionBD;
import GUI.VentanaPrincipal;
import java.sql.Connection;
import javax.swing.UIManager;

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
        
        //Para comprobar si hubo conexion con BD (Pongan su info en ConexionBD.java)
        
        // obtener la instancia única de ConexionBD
        ConexionBD conexionBD = ConexionBD.getInstancia();

        // obtener la conexion
        Connection conexion = conexionBD.getConexion();
        
        //Comprobar. 
        
        if (conexion != null) {
            System.out.println("La conexión a la base de datos es exitosa.");
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }
         
    
        
    }
}
