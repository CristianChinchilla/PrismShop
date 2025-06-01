/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// MainController.java
package Controller;

import Model.DataManager;
import Model.ImageManager;
import Model.ProductManager;
import Model.UserManager;
import Model.Session;

/**
 * Controla el flujo principal de la aplicación:
 * - Inicializa los diferentes sub‐controladores (Login, Navegación, Catálogo, etc.)
 * - Mantiene el estado global (usuario, sesión, rol)
 */
public class MainController {

    private final DataManager dataManager;
    private final ImageManager imageManager;
    private final ProductManager productManager;
    private final UserManager userManager;

    private final LoginController loginController;
    private final NavigationController navigationController;
    private final CatalogController catalogController;
    private final SearchController searchController;
    private final ProductController productController;
    private final ImageController imageController;
    private final FormController formController;
    private final DialogController dialogController;

    private Session currentSession;

    /** Constructor principal que inicializa todos los sub‐controladores */
    public MainController() {
        this.dataManager    = new DataManager();                   // crea carpeta “data” si hace falta
        this.imageManager   = new ImageManager();                  // crea carpeta “images” si hace falta
        this.productManager = new ProductManager(dataManager);     // inventario en memoria
        this.userManager    = new UserManager(dataManager);        // almacena usuarios

        this.loginController      = new LoginController(userManager);
        this.navigationController = new NavigationController();
        this.catalogController    = new CatalogController(productManager);
        this.searchController     = new SearchController(productManager);
        this.productController    = new ProductController(productManager);
        this.imageController      = new ImageController(imageManager);
        this.formController       = new FormController();
        this.dialogController     = new DialogController();

        this.currentSession = null;
    }

    /** Método que arranca la aplicación */
    public void startApp() {
        // Aquí típicamente llamas a la vista de login o pantalla inicial
        // Por ejemplo: View.showLoginScreen(this);
    }

    /**
     * Intenta autenticar al usuario; si tiene éxito, guarda la sesión y retorna true.
     * @param username Nombre de usuario ingresado
     * @param password Contraseña ingresada
     * @return true si el login fue correcto, false en caso contrario
     */
    public boolean doLogin(String username, String password) {
        boolean ok = loginController.login(username, password);
        if (ok) {
            // Crea objeto Session (podríamos usar un UUID real si se desea)
            String sessionId = java.util.UUID.randomUUID().toString();
            this.currentSession = new Session(sessionId, userManager.getCurrentUser(), System.currentTimeMillis());
        }
        return ok;
    }

    /** Cierra la sesión activa y notifica a la vista para que vuelva al login */
    public void doLogout() {
        loginController.logout();
        this.currentSession = null;
        // Por ejemplo: View.showLoginScreen(this);
    }

    /** Devuelve el rol del usuario logueado (“ADMIN” o “CLIENT”) */
    public String getCurrentUserRole() {
        if (currentSession == null) return "";
        return currentSession.getCurrentUser().getUserType();
    }

    /**
     * Llama a la lógica de navegación para ir a la pantalla inicial (destacado) 
     * según el rol (“ADMIN” o “CLIENT”).
     */
    public void goToHomeScreen() {
        String role = getCurrentUserRole();
        if ("ADMIN".equalsIgnoreCase(role)) {
            navigationController.navigateToAdminHome();
        } else {
            navigationController.navigateToClientHome();
        }
    }

    /** Filtra el catálogo según categoría para el rol actual */
    public java.util.List<Model.Product> getCatalogByCategory(String categoryId) {
        return catalogController.getProductsByCategory(categoryId);
    }

    /** Busca productos con criterios mixtos (ID/nombre, categoría, modelo) */
    public java.util.List<Model.Product> searchProducts(
            String idOrName, String categoryId, String modelId) {
        return searchController.searchProducts(idOrName, categoryId, modelId);
    }

    /** Agrega un nuevo producto usando los datos proporcionados por la vista
     * @param id
     * @param name
     * @param description
     * @param category
     * @param brand
     * @param price
     * @param quantity
     * @param imagePath
     * @return  */
    public boolean addNewProduct(
            String id, String name, String description,
            Model.Category category, Model.Brand brand,
            double price, int quantity, String imagePath) {

        Model.Product p = formController.buildProduct(
            id, name, description, category, brand, price, quantity, imagePath);

        boolean created = productController.createProduct(p);
        if (created && imagePath != null && !imagePath.isEmpty()) {
            imageController.saveImage(imagePath);
        }
        return created;
    }

    /** Edita un producto existente según los datos del formulario */
    public boolean editExistingProduct(
            String id, String name, String description,
            Model.Category category, Model.Brand brand,
            double price, int quantity, String imagePath) {

        Model.Product p = formController.buildProduct(
            id, name, description, category, brand, price, quantity, imagePath);

        boolean updated = productController.updateProduct(p);
        if (updated && imagePath != null && !imagePath.isEmpty()) {
            imageController.saveImage(imagePath);
        }
        return updated;
    }

    /** Elimina producto por ID y borra su imagen asociada si existe */
    public boolean removeProduct(String productId) {
        Model.Product p = productManager.getProduct(productId);
        if (p != null) {
            boolean deleted = productController.deleteProduct(productId);
            if (deleted && p.getImagePath() != null && !p.getImagePath().isEmpty()) {
                imageController.deleteImage(p.getImagePath());
            }
            return deleted;
        }
        return false;
    }

    /** Recupera un producto para cargarlo en formulario de edición */
    public Model.Product getProductForEdit(String productId) {
        return productController.getProductById(productId);
    }
}

