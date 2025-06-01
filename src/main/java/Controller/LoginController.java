/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// LoginController.java
package Controller;

import Model.User;
import Model.UserManager;

/**
 * Controla el login/logout de usuarios
 */
public class LoginController {

    private final UserManager userManager;

    public LoginController(UserManager userManager) {
        this.userManager = userManager;
    }

    /**
     * Valida credenciales. 
     * Si son válidas, almacena el usuario en UserManager.currentUser.
     * @param username nombre de usuario
     * @param password contraseña
     * @return true si es válido, false si no
     */
    public boolean login(String username, String password) {
        return userManager.validateLogin(username, password);
    }

    /** Cierra sesión (borra currentUser) */
    public void logout() {
        userManager.logout();
    }
}

