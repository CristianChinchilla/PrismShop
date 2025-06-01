/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// User.java
package Model;

/**
 * Representa a un usuario del sistema.
 * Atributos básicos:
 *  - id        : identificador único (String, UUID o similar)
 *  - username  : nombre de usuario para login
 *  - password  : contraseña (debería almacenarse como hash en producción)
 *  - userType  : rol del usuario (“CLIENT” o “ADMIN”)
 */
public class User {

    private String id;
    private String username;
    private String password;
    private String userType;

    /* --------------------- CONSTRUCTORES --------------------- */

    /** Constructor por defecto: deja todo en blanco / valores neutros */
    public User() {
        this.id        = "";
        this.username  = "";
        this.password  = "";
        this.userType  = "";
    }

    /**
     * Constructor completo.
     *
     * @param id        Identificador único del usuario.
     * @param username  Nombre de usuario (login).
     * @param password  Contraseña (idealmente un hash en la realidad).
     * @param userType  Rol o tipo de usuario (“CLIENT” o “ADMIN”).
     */
    public User(String id, String username, String password, String userType) {
        this.id        = id;
        this.username  = username;
        this.password  = password;
        this.userType  = userType;
    }

    /* --------------------- GETTERS y SETTERS --------------------- */

    /** @return ID único del usuario */
    public String getId() {
        return id;
    }

    /** @param id Nuevo ID del usuario */
    public void setId(String id) {
        this.id = id;
    }

    /** @return Nombre de usuario (login) */
    public String getUsername() {
        return username;
    }

    /** @param username Nuevo nombre de usuario */
    public void setUsername(String username) {
        this.username = username;
    }

    /** @return Contraseña (sin hash en este ejemplo) */
    public String getPassword() {
        return password;
    }

    /** @param password Nueva contraseña */
    public void setPassword(String password) {
        this.password = password;
    }

    /** @return Rol del usuario (“CLIENT” o “ADMIN”) */
    public String getUserType() {
        return userType;
    }

    /** @param userType Nuevo rol para el usuario */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /* --------------------- MÉTODO toString (debug) --------------------- */

    @Override
    public String toString() {
        return "User{" +
               "id='" + id + '\'' +
               ", username='" + username + '\'' +
               ", userType='" + userType + '\'' +
               '}';
    }
}

