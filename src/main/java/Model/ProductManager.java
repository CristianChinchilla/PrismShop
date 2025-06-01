/*
 *
 *
 */
package Model;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Mantiene el inventario en memoria y delega la persistencia a DataManager.
 */
public class ProductManager {

    public static List<Product> buscarProductos(String texto, String categoria, String modelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private final Map<String, Product> inventory; // clave = productId
    private final DataManager dataManager;

    /* ------------------- CONSTRUCTORES ------------------- */

    /**
     * Crea un ProductManager con DataManager por defecto y
     * carga un inventario inicial vacío.
     */
    public ProductManager() {
        this(new DataManager());
    }

    /**
     * Crea un ProductManager usando un DataManager específico y
     * carga (o inicializa) el inventario.
     *
     * @param dataManager Instancia ya configurada de DataManager.
     */
    public ProductManager(DataManager dataManager) {
        this.dataManager = dataManager;
        this.inventory   = new HashMap<>();
        // Si tuvieras persistencia en disco, aquí llamarías loadFromFile():
        // loadFromFile();
        System.out.println("[ProductManager] Inventario iniciado (0 items)");
    }

    /* ------------------- MÉTODOS BÁSICOS ------------------- */

    public void addProduct(Product p) {
        inventory.put(p.getId(), p);
    }

    public Product getProduct(String id) {
        return inventory.get(id);
    }

    public Map<String, Product> getInventorySnapshot() {
        return Collections.unmodifiableMap(inventory);
    }

    /* Aquí irían updateProduct(), removeProduct(), saveToFile(), etc. */
}


