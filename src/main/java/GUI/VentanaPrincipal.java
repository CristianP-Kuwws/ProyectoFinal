/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hazky
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo2 = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblIniciarSesion = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        separador1 = new javax.swing.JSeparator();
        labelContrasenia = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        campoContrasenia = new javax.swing.JPasswordField();
        jpanelIniciarSesion = new javax.swing.JPanel();
        lblbtn128 = new javax.swing.JLabel();
        jpanelRegistrarse = new javax.swing.JPanel();
        lblbtn = new javax.swing.JLabel();
        NextPag = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo2.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo2.setText("Y Facturacion de Productos");
        jPanel2.add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 330, 60));

        lblTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setText("Sistema de Inventario");
        jPanel2.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 290, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -10, 350, 470));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 460, 100));

        lblIniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblIniciarSesion.setForeground(new java.awt.Color(51, 51, 51));
        lblIniciarSesion.setText("INICIAR SESION");
        jPanel1.add(lblIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 270, 40));

        labelUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(0, 0, 0));
        labelUsuario.setText("Usuario");
        jPanel1.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 30));

        campoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        campoUsuario.setText("Ingresa tu nombre de usuario");
        campoUsuario.setBorder(null);
        campoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoUsuarioMousePressed(evt);
            }
        });
        jPanel1.add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 360, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 0));

        separador1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 360, 10));

        labelContrasenia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        labelContrasenia.setText("Contraseña");
        jPanel1.add(labelContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, 30));

        separador2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 360, 10));

        campoContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        campoContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        campoContrasenia.setText("********");
        campoContrasenia.setToolTipText("");
        campoContrasenia.setBorder(null);
        campoContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoContraseniaMousePressed(evt);
            }
        });
        jPanel1.add(campoContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 360, -1));

        jpanelIniciarSesion.setBackground(new java.awt.Color(51, 51, 51));
        jpanelIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpanelIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpanelIniciarSesionMouseClicked(evt);
            }
        });
        jpanelIniciarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblbtn128.setBackground(new java.awt.Color(255, 255, 255));
        lblbtn128.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblbtn128.setForeground(new java.awt.Color(255, 255, 255));
        lblbtn128.setText("Iniciar Sesion");
        lblbtn128.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpanelIniciarSesion.add(lblbtn128, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 40));

        jPanel1.add(jpanelIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 110, 40));

        jpanelRegistrarse.setBackground(new java.awt.Color(51, 51, 51));
        jpanelRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpanelRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpanelRegistrarseMouseClicked(evt);
            }
        });
        jpanelRegistrarse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblbtn.setBackground(new java.awt.Color(255, 255, 255));
        lblbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblbtn.setForeground(new java.awt.Color(255, 255, 255));
        lblbtn.setText("Registrarse");
        lblbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpanelRegistrarse.add(lblbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 40));

        jPanel1.add(jpanelRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, 40));

        javax.swing.GroupLayout NextPagLayout = new javax.swing.GroupLayout(NextPag);
        NextPag.setLayout(NextPagLayout);
        NextPagLayout.setHorizontalGroup(
            NextPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        NextPagLayout.setVerticalGroup(
            NextPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel1.add(NextPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Campos Mouse Pressers (No tocar)
    private void campoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoUsuarioMousePressed
        
        if (campoUsuario.getText().equals("Ingresa tu nombre de usuario")) {
            
            campoUsuario.setText("");
            campoUsuario.setForeground(Color.black);
        }
        
        if (String.valueOf(campoContrasenia.getPassword()).isEmpty()) {
            campoContrasenia.setText("********");
            campoContrasenia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_campoUsuarioMousePressed

    private void campoContraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoContraseniaMousePressed
        
        if (String.valueOf(campoContrasenia.getPassword()).equals("********")) {
            campoContrasenia.setText("");
            campoContrasenia.setForeground(Color.black);
        }
        
        if (campoUsuario.getText().isEmpty()) {
            campoUsuario.setText("Ingresa tu nombre de usuario");
            campoUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_campoContraseniaMousePressed
    
    // Funcionalidades Generales
    private void jpanelIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelIniciarSesionMouseClicked
        
        String nombreUsuario = campoUsuario.getText();
        char[] contraseniaArr = campoContrasenia.getPassword();
        String contrasenia = new String(contraseniaArr);
        boolean encontrado = false; 

        
        if (nombreUsuario.isEmpty() || contrasenia.isEmpty() ||
            nombreUsuario.equals("Ingresa tu nombre de usuario") ||
            contrasenia.equals("********")) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos correctamente.", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        /* Esperando implementacion y mejora con bd.
        for (Usuario usuarioInd : listaUsuarios) {
            if (usuarioInd.getCorreo().equals(correoIngresado) && usuarioInd.getContrasenia().equals(contraseniaIngresada)) {
                encontrado = true;
		setUsuarioActual(usuarioInd); 

		if (usuarioInd instanceof UsuarioAdmin) {
                    JOptionPane.showMessageDialog(null, "Bienvenido " + usuarioInd.getNombre() + ".\nNivel de acceso: Administrador.");
		} else {
                    JOptionPane.showMessageDialog(null, "Bienvenido " + usuarioInd.getNombre() + ".\nNivel de acceso: Usuario.");
		}

		break; 
            }
	}

	if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos.");
	 }
        
        */
    }//GEN-LAST:event_jpanelIniciarSesionMouseClicked

    private void jpanelRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelRegistrarseMouseClicked

        Registro registrarUsuario = new Registro();
        registrarUsuario.setVisible(true);
        
        this.setEnabled(false); // Deshabilita VentanaPrincipal pero la deja visible

        
        registrarUsuario.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                setEnabled(true); // Vuelve a habilitar VentanaPrincipal cuando se cierre Registro
                toFront(); // Trae la ventana al frente en caso de que quede en segundo plano
            }
        });
           
    }//GEN-LAST:event_jpanelRegistrarseMouseClicked

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane NextPag;
    private javax.swing.JPasswordField campoContrasenia;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpanelIniciarSesion;
    private javax.swing.JPanel jpanelRegistrarse;
    private javax.swing.JLabel labelContrasenia;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblbtn;
    private javax.swing.JLabel lblbtn128;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    // End of variables declaration//GEN-END:variables
}
