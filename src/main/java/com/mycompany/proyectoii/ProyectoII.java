/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoii;


import Datos.ConexionBD;
import GUI.VentanaPrincipal;
import java.sql.Connection;

/** 
 *
 * @author hazky
 */
public class ProyectoII {

    public static void main(String[] args) {
        
        //VentanaPrincipal ventana = new VentanaPrincipal();
        //ventana.setVisible(true);
        
        System.out.println("prueba de pull elliam.");
        
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
         
        //Cerrar, quizas esta demas

        conexionBD.cerrarConexion();
    
        
    }
}
