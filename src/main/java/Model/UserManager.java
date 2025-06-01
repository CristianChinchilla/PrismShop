/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// UserManager.java
package Model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gestiona usuarios, login y registro.  
 * — Mantiene el mapa (username → User).  
 * — Se apoya en DataManager para persistir si lo necesitas.
 */
public class UserManager {

    private final Map<String, User> users;   // clave = username
    private final DataManager dataManager;   // para persistencia en disco
    private User currentUser;                // usuario con sesión activa

    /* ------------------- CONSTRUCTORES ------------------- */

    /**
     * Constructor por defecto.  
     * - Crea un DataManager con la carpeta “data” por defecto.  
     * - Inicia el mapa de usuarios vacío.
     */
    public UserManager() {
        this(new DataManager());
    }

    /**
     * Constructor que recibe un DataManager ya configurado.  
     * - El inventario de usuarios inicia vacío (puedes luego cargarlo de JSON).
     *
     * @param dataManager instancia ya inicializada de DataManager.
     */
    public UserManager(DataManager dataManager) {
        this.dataManager = dataManager;
        this.users       = new HashMap<>();
        this.currentUser = null;
        System.out.println("[UserManager] Inicializado con 0 usuarios.");
    }

    /**
     * Constructor que recibe DataManager y un mapa inicial de usuarios.  
     * Útil para inyectar usuarios precargados (p.ej. en pruebas unitarias).
     *
     * @param dataManager  instancia de DataManager.
     * @param initialUsers mapa (username → User) con los usuarios existentes.
     */
    public UserManager(DataManager dataManager, Map<String, User> initialUsers) {
        this.dataManager = dataManager;
        this.users       = new HashMap<>(initialUsers);
        this.currentUser = null;
        System.out.println("[UserManager] Inicializado con "
                           + users.size() + " usuario(s) precargado(s).");
    }

    /* ------------------- MÉTODOS BÁSICOS ------------------- */

    /** Registra un nuevo usuario; devuelve true si se añadió, false si ya existe. */
    public boolean registerUser(User u) {
        if (users.containsKey(u.getUsername())) return false;
        users.put((String) u.getUsername(), u);
        return true;
    }

    /** Valida credenciales; si son correctas guarda currentUser y devuelve true. */
    public boolean validateLogin(String username, String password) {
        User u = users.get(username);
        if (u != null && u.getPassword().equals(password)) {
            currentUser = u;
            return true;
        }
        return false;
    }

    /** Cierra la sesión activa. */
    public void logout() {
        currentUser = null;
    }

    /** Devuelve un mapa de solo lectura con todos los usuarios. */
    public Map<String, User> getAllUsers() {
        return Collections.unmodifiableMap(users);
    }

    /** Devuelve el usuario actualmente logueado, o null si no hay sesión. */
    public User getCurrentUser() {
        return currentUser;
    }
}

