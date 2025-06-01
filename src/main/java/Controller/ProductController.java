/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// ProductController.java
package Controller;

import java.util.Objects;
import Model.Product;
import Model.ProductManager;

/**
 * Funciones CRUD para productos (modo Admin):
 * - Añadir
 * - Editar
 * - Eliminar
 * - Obtener por ID
 */
public class ProductController {

    private final ProductManager productManager;

    public ProductController(ProductManager productManager) {
        this.productManager = productManager;
    }

    /**
     * Crea un nuevo producto. Retorna true si se añadió, false si ya existía ID.
     * @param p instancia completa de Product
     */
    public boolean createProduct(Product p) {
        Objects.requireNonNull(p, "Product no puede ser null");
        if (productManager.getInventorySnapshot().containsKey(p.getId())) {
            return false; // ya existe
        }
        productManager.addProduct(p);
        return true;
    }

    /**
     * Actualiza un producto existente. Retorna true si se actualizó, false si no existe el ID.
     * @param p instancia con mismo ID que un producto previo
     */
    public boolean updateProduct(Product p) {
        Objects.requireNonNull(p, "Product no puede ser null");
        if (!productManager.getInventorySnapshot().containsKey(p.getId())) {
            return false; // no existe
        }
        productManager.addProduct(p); // sobrescribe
        return true;
    }

    /**
     * Elimina un producto por su ID. Retorna true si se borró, false si no existía.
     * @param productId ID del producto a eliminar
     */
    public boolean deleteProduct(String productId) {
        if (productManager.getInventorySnapshot().containsKey(productId)) {
            productManager.getInventorySnapshot().remove(productId);
            return true;
        }
        return false;
    }

    /**
     * Obtiene un producto por su ID (para pre‐cargar datos en formulario).
     * @param productId ID buscado
     * @return instancia de Product o null si no la encuentra
     */
    public Product getProductById(String productId) {
        return productManager.getInventorySnapshot().get(productId);
    }
}

