/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// SearchController.java
package Controller;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import Model.Product;
import Model.ProductManager;

/**
 * Controlador de búsqueda de productos. Permite filtrar por ID/nombre,
 * categoría y/o marca (modelo).
 */
public class SearchController {

    private final ProductManager productManager;

    /**
     * @param productManager instancia de ProductManager (inventario en memoria)
     */
    public SearchController(ProductManager productManager) {
        this.productManager = Objects.requireNonNull(productManager,
                "ProductManager no puede ser null");
    }

    /**
     * Busca productos usando hasta tres criterios posibles. Si un criterio es nulo
     * o vacío, se ignora. La búsqueda por "idOrName" es insensible a mayúsculas
     * y acepta coincidencias parciales en el nombre.
     *
     * @param idOrName   ID exacto o parte del nombre (null/"" = ignorar)
     * @param categoryId ID de categoría (null/"" = ignorar)
     * @param modelId    ID de marca/modelo (null/"" = ignorar)
     * @return lista (posiblemente vacía) de productos que cumplen todos los criterios
     */
    public List<Product> searchProducts(String idOrName, String categoryId, String modelId) {
        Map<String, Product> allProducts = productManager.getInventorySnapshot();

        // Si no hay criterios, devolvemos lista vacía (podríamos retornar todos, según necesidades)
        if (isBlank(idOrName) && isBlank(categoryId) && isBlank(modelId)) {
            return Collections.emptyList();
        }

        String idOrNameLower = safeTrimToNull(idOrName);
        String categoryFilter = safeTrimToNull(categoryId);
        String modelFilter    = safeTrimToNull(modelId);

        return allProducts.values().stream()
            .filter(p -> matchesIdOrName(p, idOrNameLower))
            .filter(p -> matchesCategory(p, categoryFilter))
            .filter(p -> matchesModel(p, modelFilter))
            .collect(Collectors.toList());
    }

    /* ============================ MÉTODOS AUXILIARES ============================ */

    private boolean matchesIdOrName(Product p, String idOrNameLower) {
        if (idOrNameLower == null) {
            return true;
        }
        // Comparar ID exacto (ignora mayúsculas) o nombre que contenga la subcadena
        return p.getId().equalsIgnoreCase(idOrNameLower)
            || p.getName().toLowerCase().contains(idOrNameLower);
    }

    private boolean matchesCategory(Product p, String categoryFilter) {
        if (categoryFilter == null) {
            return true;
        }
        return p.getCategory() != null
            && categoryFilter.equals(p.getCategory().getId());
    }

    private boolean matchesModel(Product p, String modelFilter) {
        if (modelFilter == null) {
            return true;
        }
        return p.getBrand() != null
            && modelFilter.equals(p.getBrand().getId());
    }

    /**
     * Si la cadena es null o está vacía tras hacer trim, retorna null; de lo contrario,
     * devuelve la cadena en minúsculas.
     */
    private String safeTrimToNull(String s) {
        if (s == null) {
            return null;
        }
        String trimmed = s.trim().toLowerCase();
        return trimmed.isEmpty() ? null : trimmed;
    }

    private boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }
}

    
