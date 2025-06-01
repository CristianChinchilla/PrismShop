/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Session.java
package Model;
/**
 * Representa la sesión de un usuario conectado:
 * - sessionId: identificador único de esta sesión (por ejemplo, un UUID).
 * - currentUser: usuario que inició sesión.
 * - loginTimestamp: momento en milisegundos en que se creó la sesión.
 */
public class Session {

    private String sessionId;
    private User currentUser;
    private long loginTimestamp;

    /** 
     * Constructor por defecto: crea una sesión “vacía” con valores neutros.
     * - sessionId se inicializa a cadena vacía.
     * - currentUser se inicializa a un User nuevo (sin datos).
     * - loginTimestamp se fija al momento actual. 
     */
    public Session() {
        this.sessionId      = "";
        this.currentUser    = new User();
        this.loginTimestamp = System.currentTimeMillis();
    }

    /**
     * Constructor completo:
     * @param sessionId      Identificador único de la sesión (p. ej. UUID.randomUUID().toString()).
     * @param currentUser    Instancia de User que representa al usuario logueado.
     * @param loginTimestamp Valor de System.currentTimeMillis() al iniciar sesión.
     */
    public Session(String sessionId, User currentUser, long loginTimestamp) {
        this.sessionId      = sessionId;
        this.currentUser    = currentUser;
        this.loginTimestamp = loginTimestamp;
    }

    /* ==================== GETTERS y SETTERS ==================== */

    /** @return Identificador de esta sesión */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * @param sessionId Nuevo identificador de sesión (no debe ser null o vacío).
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /** @return Usuario que inició esta sesión */
    public User getCurrentUser() {
        return currentUser;
    }

}