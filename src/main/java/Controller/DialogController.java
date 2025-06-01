/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// DialogController.java
package Controller;

import java.util.List;
import Model.Product;

/**
 * Controla la lógica detrás de los diálogos modales:
 * - Diálogo de Búsqueda (valida criterios mínimos)
 * - Diálogo de Confirmación para Eliminar
 * - Diálogo de Editar Imagen
 */
public class DialogController {

    public DialogController() {
        // Sin estado interno; todo es manejado por métodos
    }

    /**
     * Valida que al menos uno de los criterios no esté vacío.
     * @param idOrName   ID o nombre (puede ser null/empty)
     * @param categoryId categoría (puede ser null/empty)
     * @param modelId    modelo/brand (puede ser null/empty)
     * @return true si se cumple al menos un criterio, false si todos están vacíos
     */
    public boolean validateSearchCriteria(String idOrName, String categoryId, String modelId) {
        return (idOrName != null && !idOrName.trim().isEmpty()) ||
               (categoryId != null && !categoryId.trim().isEmpty()) ||
               (modelId != null && !modelId.trim().isEmpty());
    }

    /**
     * Genera mensaje de confirmación cuando se desea eliminar un producto.
     * @param productId ID del producto a eliminar
     * @return texto con la pregunta de confirmación
     */
    public String getDeleteConfirmationText(String productId) {
        return "¿Seguro que deseas eliminar el producto con ID " + productId + "?";
    }

    /**
     * Valida que el ID exista en el listado de productos antes de abrir el diálogo de edición.
     * @param productId ID a validar
     * @param allProducts lista completa de productos (por ejemplo, de ProductManager)
     * @return true si existe un producto con ese ID, false si no
     */
    public boolean validateExistingProductId(String productId, List<Product> allProducts) {
        return allProducts.stream().anyMatch(p -> productId.equals(p.getId()));
    }
}

