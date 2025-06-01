/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// NavigationController.java
package Controller;

/**
 * Controla la navegación entre pantallas (sin lógica de Swing, solo nombres de pantallas).
 */
public class NavigationController {

    /** Vista cliente: “Destacado” en modo cliente */
    public void navigateToClientHome() {
        // En view: JFrame.showClientDestacado();
        System.out.println("[Navigation] Navegando a Destacado (Cliente)");
    }

    /** Vista administrador: “Destacado” en modo admin */
    public void navigateToAdminHome() {
        // En view: JFrame.showAdminDestacado();
        System.out.println("[Navigation] Navegando a Destacado (Admin)");
    }

    /** Navegar al catálogo de una categoría específica en modo cliente */
    public void navigateToClientCatalog(String categoryId) {
        // En view: JFrame.showClientCatalog(categoryId);
        System.out.println("[Navigation] Cliente → Catálogo categoría: " + categoryId);
    }

    /** Navegar al catálogo de una categoría específica en modo admin */
    public void navigateToAdminCatalog(String categoryId) {
        // En view: JFrame.showAdminCatalog(categoryId);
        System.out.println("[Navigation] Admin → Gestión categoría: " + categoryId);
    }

    /** Navegar a la vista de detalle de producto (cliente) */
    public void navigateToProductDetail(String productId) {
        // En view: JFrame.showProductDetail(productId);
        System.out.println("[Navigation] Cliente → Detalle producto: " + productId);
    }

    /** Navegar a la vista CrearProducto (admin) */
    public void navigateToCreateProductForm() {
        // En view: JFrame.showCreateProductForm();
        System.out.println("[Navigation] Admin → Crear Producto");
    }

    /** Navegar a la vista EditarProducto (admin) */
    public void navigateToEditProductForm(String productId) {
        // En view: JFrame.showEditProductForm(productId);
        System.out.println("[Navigation] Admin → Editar Producto ID: " + productId);
    }

    /** Navegar a la vista EditarImagen (admin) */
    public void navigateToEditImage(String productId) {
        // En view: JFrame.showEditImageDialog(productId);
        System.out.println("[Navigation] Admin → Editar Imagen Producto ID: " + productId);
    }

    /** Navegar a la vista BuscarProducto (modal) */
    public void navigateToSearchDialog() {
        // En view: JFrame.showSearchDialog();
        System.out.println("[Navigation] Abriendo diálogo Buscar Producto");
    }
}

