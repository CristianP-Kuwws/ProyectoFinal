package com.mycompany.proyectoii;

import GUI.VentanaPrincipal;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
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

        //System.out.println("prueba de pull elliam.");
       // System.out.println("prueba de pull Eithan.");
        //System.out.println("prueba de pull Eithan.");

    }
}
