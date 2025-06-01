/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// ImageManager.java
// ImageManager.java
package Model;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ImageManager {

    private Path imagesDir;

    /** 
     * Constructor por defecto: asigna “images” en la raíz del proyecto.
     */
    public ImageManager() {
        this.imagesDir = Paths.get("images").toAbsolutePath();
    }

    /**
     * Constructor que recibe una ruta específica para almacenar imágenes.
     *
     * @param imagesDirPath Ruta a la carpeta de imágenes.
     */
    public ImageManager(Path imagesDirPath) {
        this.imagesDir = imagesDirPath.toAbsolutePath();
    }

    /** Devuelve la ruta donde se guardan las imágenes. */
    public Path getImagesDir() {
        return imagesDir;
    }

    /**
     * Modifica la carpeta donde se guardarán las imágenes.
     *
     * @param imagesDir Nueva ruta de la carpeta de imágenes.
     */
    public void setImagesDir(Path imagesDir) {
        this.imagesDir = imagesDir.toAbsolutePath();
    }
}



