/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Category.java
package Model;

/**
 * Representa una categoría de producto (por ejemplo: “Monitores”, “Accesorios”).
 * Contiene un ID único y un nombre descriptivo.
 */
public class Category {

    private String id;
    private String name;

    /** Constructor por defecto: inicializa id y name como cadenas vacías */
    public Category() {
        this.id = "";
        this.name = "";
    }

    /**
     * Constructor completo.
     *
     * @param id   Identificador único de la categoría.
     * @param name Nombre descriptivo de la categoría.
     */
    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /* ==================== GETTERS y SETTERS ==================== */

    /** @return ID único de la categoría */
    public String getId() {
        return id;
    }

    /**
     * @param id Nuevo ID para la categoría.
     *           No debe estar vacío ni duplicarse en el inventario.
     */
    public void setId(String id) {
        this.id = id;
    }

    /** @return Nombre descriptivo de la categoría */
    public String getName() {
        return name;
    }

    /**
     * @param name Nuevo nombre de la categoría (no debe ser null).
     */
    public void setName(String name) {
        this.name = name;
    }

    /* ==================== MÉTODO toString para debug ==================== */

    @Override
    public String toString() {
        return "Category{" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               '}';
    }
}
