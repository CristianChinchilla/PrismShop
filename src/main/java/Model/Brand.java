/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Brand.java
package Model;

/**
 * Representa una marca o modelo de producto (por ejemplo: “LG”, “Razer”).
 * Contiene un ID único y un nombre descriptivo.
 */
public class Brand {

    private String name;

    /** Constructor por defecto: inicializa id y name como cadenas vacías */
    public Brand() {
        this.name = "";
    }

    /**
     * Constructor completo.
     *
     * @param id   Identificador único de la marca.
     * @param name Nombre descriptivo de la marca.
     */
    public Brand( String name) {

        this.name = name;
    }

    /* ==================== GETTERS y SETTERS ==================== */

    /** @return ID único de la marca */
    /**
     * @param id Nuevo ID para la marca.
     *           No debe estar vacío ni duplicarse en el inventario.
     */

    /** @return Nombre descriptivo de la marca */
    public String getName() {
        return name;
    }

    /**
     * @param name Nuevo nombre de la marca (no debe ser null).
     */
    public void setName(String name) {
        this.name = name;
    }
}
    /* ==================== MÉTODO toString para debug ==================== */


