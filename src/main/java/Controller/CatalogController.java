/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// CatalogController.java
package Controller;

import java.util.List;
import java.util.stream.Collectors;
import Model.Product;
import Model.ProductManager;

/**
 * Maneja la lógica de catálogos por categoría:
 * - Filtrar productos
 * - Actualizar vistas de catálogo
 */
public class CatalogController {

    private final ProductManager productManager;

    public CatalogController(ProductManager productManager) {
        this.productManager = productManager;
    }

    /**
     * Devuelve la lista de productos cuya categoría coincide con el parámetro.
     * @param categoryId ID de la categoría a filtrar
     * @return lista de productos filtrados (vacía si ninguno)
     */
    public List<Product> getProductsByCategory(String categoryId) {
        return productManager.getInventorySnapshot().values().stream()
                .filter(p -> p.getCategory() != null
                          && categoryId.equals(p.getCategory().getId()))
                .collect(Collectors.toList());
    }
}

