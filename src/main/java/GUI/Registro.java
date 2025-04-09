/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Datos.DAOS.RegistrarUsuarioBD;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author hazky
 */
public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblIniciarSesion = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        separador1 = new javax.swing.JSeparator();
        labelContrasenia = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        campoContrasenia = new javax.swing.JPasswordField();
        jpanelCrearUsuario = new javax.swing.JPanel();
        lblbtn128 = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        separador3 = new javax.swing.JSeparator();
        jpanelVolverAInicio = new javax.swing.JPanel();
        lblbtn = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        campoUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(14, 189, 187));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Registro");
        jPanel2.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 110, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -10, 350, 470));

        jPanel3.setBackground(new java.awt.Color(122, 198, 208));
        jPanel3.setForeground(new java.awt.Color(122, 198, 208));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 460, 60));

        lblIniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblIniciarSesion.setForeground(new java.awt.Color(111, 162, 195));
        lblIniciarSesion.setText("Crear un nuevo usuario");
        jPanel1.add(lblIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 290, 40));

        labelUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(111, 162, 195));
        labelUsuario.setText("Usuario");
        jPanel1.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 0));

        separador1.setForeground(new java.awt.Color(14, 191, 214));
        jPanel1.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 360, 10));

        labelContrasenia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelContrasenia.setForeground(new java.awt.Color(111, 162, 195));
        labelContrasenia.setText("Contraseña");
        jPanel1.add(labelContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, 30));

        separador2.setForeground(new java.awt.Color(14, 191, 214));
        jPanel1.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 360, 10));

        campoContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        campoContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        campoContrasenia.setText("********");
        campoContrasenia.setToolTipText("");
        campoContrasenia.setBorder(null);
        campoContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoContraseniaFocusLost(evt);
            }
        });
        campoContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoContraseniaMousePressed(evt);
            }
        });
        jPanel1.add(campoContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 360, -1));

        jpanelCrearUsuario.setBackground(new java.awt.Color(14, 191, 214));
        jpanelCrearUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpanelCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpanelCrearUsuarioMouseClicked(evt);
            }
        });
        jpanelCrearUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblbtn128.setBackground(new java.awt.Color(255, 255, 255));
        lblbtn128.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblbtn128.setForeground(new java.awt.Color(255, 255, 255));
        lblbtn128.setText("Crear Usuario");
        lblbtn128.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpanelCrearUsuario.add(lblbtn128, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 40));

        jPanel1.add(jpanelCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 110, 40));

        labelCorreo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(111, 162, 195));
        labelCorreo.setText("Correo");
        jPanel1.add(labelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 30));

        separador3.setForeground(new java.awt.Color(14, 191, 214));
        jPanel1.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 360, 10));

        jpanelVolverAInicio.setBackground(new java.awt.Color(14, 191, 214));
        jpanelVolverAInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpanelVolverAInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpanelVolverAInicioMouseClicked(evt);
            }
        });
        jpanelVolverAInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblbtn.setBackground(new java.awt.Color(255, 255, 255));
        lblbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblbtn.setForeground(new java.awt.Color(255, 255, 255));
        lblbtn.setText("Cancelar");
        lblbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpanelVolverAInicio.add(lblbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 40));

        jPanel1.add(jpanelVolverAInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        campoCorreo.setBackground(new java.awt.Color(255, 255, 255));
        campoCorreo.setText("Ingresa un correo");
        campoCorreo.setBorder(null);
        campoCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCorreoFocusLost(evt);
            }
        });
        campoCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoCorreoMousePressed(evt);
            }
        });
        jPanel1.add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 360, 30));

        campoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        campoUsuario.setText("Ingresa tu nombre de usuario");
        campoUsuario.setBorder(null);
        campoUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoUsuarioFocusLost(evt);
            }
        });
        campoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoUsuarioMousePressed(evt);
            }
        });
        jPanel1.add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 360, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Campo Contrasenia Mouse Pressed (No tocar)
    private void campoContraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoContraseniaMousePressed

        if (String.valueOf(campoContrasenia.getPassword()).equals("********")) {
            campoContrasenia.setText("");
            campoContrasenia.setForeground(Color.black);
        }
        if (campoUsuario.getText().isEmpty()) {
            campoUsuario.setText("Ingresa tu nombre de usuario");
            campoUsuario.setForeground(Color.gray);
        }
        if (campoCorreo.getText().isEmpty()) {
            campoCorreo.setText("Ingresa un correo");
            campoCorreo.setForeground(Color.gray);
        }

    }//GEN-LAST:event_campoContraseniaMousePressed

    //Funcionalidades Generales
    private void jpanelCrearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelCrearUsuarioMouseClicked
        // Conseguir info
        String nombreUsuario = campoUsuario.getText();
        String correo = campoCorreo.getText();
        char[] contraseniaArr = campoContrasenia.getPassword();
        String contraseña = new String(contraseniaArr);

        // Verificar que los campos no esten vacios
        if (nombreUsuario.isEmpty() || correo.isEmpty() || contraseña.isEmpty()
                || nombreUsuario.equals("Ingresa tu nombre de usuario")
                || correo.equals("Ingresa un correo")
                || contraseña.equals("********")) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos correctamente.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Instancia de RegistrarUsuario
        RegistrarUsuarioBD registro = new RegistrarUsuarioBD();

        // Verificar si el correo ya existe antes de registrarlo
        if (registro.usuarioExiste(correo)) {
            JOptionPane.showMessageDialog(null, "Este correo ya existe, inicia sesion o usa otro correo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Registrar
        boolean registrado = registro.registrarUsuario(nombreUsuario, correo, contraseña);

        if (registrado) {
            JOptionPane.showMessageDialog(null, "Empleado registrado correctamente:\nNombre: " + nombreUsuario + "\nCorreo: " + correo);

            // Limpiar campos
            campoUsuario.setText("");
            campoCorreo.setText("");
            campoContrasenia.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar usuario.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        Arrays.fill(contraseniaArr, ' ');
    }//GEN-LAST:event_jpanelCrearUsuarioMouseClicked

    private void jpanelVolverAInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelVolverAInicioMouseClicked

        this.dispose(); // Volver al inicio
    }//GEN-LAST:event_jpanelVolverAInicioMouseClicked

    //Campo Correo Mouse Pressed (No tocar)   
    private void campoCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoCorreoMousePressed

        if (campoCorreo.getText().equals("Ingresa un correo")) {
            campoCorreo.setText("");
            campoCorreo.setForeground(Color.black);
        }
        if (campoUsuario.getText().isEmpty()) {
            campoUsuario.setText("Ingresa tu nombre de usuario");
            campoUsuario.setForeground(Color.gray);
        }
        if (String.valueOf(campoContrasenia.getPassword()).isEmpty()) {
            campoContrasenia.setText("********");
            campoContrasenia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_campoCorreoMousePressed

    //Campo Usuario Mouse Pressed (No tocar)
    private void campoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoUsuarioMousePressed
        if (campoUsuario.getText().equals("Ingresa tu nombre de usuario")) {
            campoUsuario.setText("");
            campoUsuario.setForeground(Color.black);
        }
        // Restaurar placeholders en otros campos si están vacíos
        if (campoCorreo.getText().isEmpty()) {
            campoCorreo.setText("Ingresa un correo");
            campoCorreo.setForeground(Color.gray);
        }
        if (String.valueOf(campoContrasenia.getPassword()).isEmpty()) {
            campoContrasenia.setText("********");
            campoContrasenia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_campoUsuarioMousePressed

    // Focus Lost para campos (No tocar)  
    private void campoUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoUsuarioFocusLost
        if (campoUsuario.getText().isEmpty()) {
            campoUsuario.setText("Ingresa tu nombre de usuario");
            campoUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_campoUsuarioFocusLost

    private void campoCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCorreoFocusLost
        if (campoCorreo.getText().isEmpty()) {
            campoCorreo.setText("Ingresa un correo");
            campoCorreo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_campoCorreoFocusLost

    private void campoContraseniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoContraseniaFocusLost
        if (String.valueOf(campoContrasenia.getPassword()).isEmpty()) {
            campoContrasenia.setText("********");
            campoContrasenia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_campoContraseniaFocusLost
    void mostarVP() {
        setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField campoContrasenia;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpanelCrearUsuario;
    private javax.swing.JPanel jpanelVolverAInicio;
    private javax.swing.JLabel labelContrasenia;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblbtn;
    private javax.swing.JLabel lblbtn128;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    // End of variables declaration//GEN-END:variables
}
