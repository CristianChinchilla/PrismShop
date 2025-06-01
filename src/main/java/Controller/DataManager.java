/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// DataManager.java
// DataManager.java
package Controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Encargado de la lectura/escritura de los archivos JSON que persisten
 * productos, usuarios, etc.
 */
public class DataManager {

    private final Path dataDir;      // Carpeta raíz de todos los JSON
    private final Path backupDir;    // Carpeta para copias de seguridad

    /* ------------------- CONSTRUCTORES ------------------- */

    /** 
     * Constructor por defecto  
     * Crea las carpetas “data” y “data/backup” en la raíz del proyecto. 
     */
    public DataManager() {
        this(Paths.get("data"));
    }

    /**
     * Constructor que acepta la ruta base donde se guardarán los archivos JSON.
     * Si la carpeta (y su subcarpeta backup) no existen, las crea.
     *
     * @param baseDir Ruta de la carpeta base (p.ej. “C:/MiApp/datos”)
     */
    public DataManager(Path baseDir) {
        this.dataDir   = baseDir.toAbsolutePath();
        this.backupDir = this.dataDir.resolve("backup");
        createDirectoryIfMissing(dataDir);
        createDirectoryIfMissing(backupDir);
        System.out.println("[DataManager] Usando carpeta   : " + dataDir);
        System.out.println("[DataManager] Carpeta de backup : " + backupDir);
    }

    /* ------------------- HELPERS PRIVADOS ------------------- */

    private void createDirectoryIfMissing(Path dir) {
        try {
            if (Files.notExists(dir)) {
                Files.createDirectories(dir);
            }
        } catch (IOException e) {
            throw new RuntimeException(
                "No se pudo crear la carpeta " + dir.toAbsolutePath(), e);
        }
    }

    /* Aquí colocarías loadProductos(), saveProductos(), loadUsuarios(), etc. */
}

