/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Product.java
package Model;

/**
 * Representa un producto en el inventario.
 * Contiene información básica (ID, nombre, descripción),
 * relaciones a Category y Brand, precio, cantidad en stock y ruta de imagen.
 */
public class Product {

    private String id;
    private String name;
    private String description;
    private Category category;
    private Brand brand;
    private double price;
    private int quantity;
    private String imagePath;

    /** Constructor por defecto: inicializa todos los campos con valores neutros */
    public Product() {
        this.id = "";
        this.name = "";
        this.description = "";
        this.category = new Category();
        this.brand = new Brand();
        this.price = 0.0;
        this.quantity = 0;
        this.imagePath = "";
    }

    /**
     * Constructor completo.
     *
     * @param id          Identificador único (String) del producto.
     * @param name        Nombre legible del producto.
     * @param description Descripción detallada del producto.
     * @param category    Objeto Category al que pertenece este producto.
     * @param brand       Objeto Brand que representa la marca/modelo.
     * @param price       Precio unitario (double).
     * @param quantity    Cantidad en stock (int).
     * @param imagePath   Ruta (o nombre de archivo) de la imagen asociada.
     */
    public Product(String id,
                   String name,
                   String description,
                   Category category,
                   Brand brand,
                   double price,
                   int quantity,
                   String imagePath) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.imagePath = imagePath;
    }

    /* ==================== GETTERS y SETTERS ==================== */

    /** @return ID único del producto */
    public String getId() {
        return id;
    }

    /**
     * @param id Nuevo ID para el producto.
     *           No debe estar vacío ni duplicarse en el inventario.
     */
    public void setId(String id) {
        this.id = id;
    }

    /** @return Nombre legible del producto */
    public String getName() {
        return name;
    }

    /** @param name Nuevo nombre del producto (no null) */
    public void setName(String name) {
        this.name = name;
    }

    /** @return Descripción detallada del producto */
    public String getDescription() {
        return description;
    }

    /** @param description Nueva descripción (puede ser cadena vacía si no hay descripción) */
    public void setDescription(String description) {
        this.description = description;
    }

    /** @return Category al que pertenece este producto */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category Nueva categoría.
     *                 No debe ser null (se asume una Category válida).
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /** @return Brand (marca/modelo) del producto */
    public Brand getBrand() {
        return brand;
    }

    /**
     * @param brand Nueva marca/modelo.
     *              No debe ser null (se asume un Brand válido).
     */
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    /** @return Precio unitario del producto */
    public double getPrice() {
        return price;
    }

    /** @param price Nuevo precio (>= 0.0) */
    public void setPrice(double price) {
        this.price = price;
    }

    /** @return Cantidad en stock */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity Nueva cantidad en stock (>= 0).
     *                 Si es negativo, se recomienda validar antes de llamar.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /** @return Ruta o nombre del archivo de imagen asociado */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * @param imagePath Nueva ruta/nombre de la imagen.
     *                  Puede ser cadena vacía si no tiene imagen aún.
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /* ==================== MÉTODO toString para debug ==================== */

    @Override
    public String toString() {
        return "Product{" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               ", description='" + description + '\'' +
               ", category=" + (category != null ? category.getId() : "null") +
               ", price=" + price +
               ", quantity=" + quantity +
               ", imagePath='" + imagePath + '\'' +
               '}';
    }
}
