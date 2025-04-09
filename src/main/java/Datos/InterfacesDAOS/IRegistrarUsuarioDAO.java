/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Datos.InterfacesDAOS;

/**
 *
 * @author hazky
 */
public interface IRegistrarUsuarioDAO {
    boolean usuarioExiste(String correo);
    boolean registrarUsuario(String nombre, String correo, String contraseña);
}
