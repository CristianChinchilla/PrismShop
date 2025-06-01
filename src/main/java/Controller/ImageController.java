/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// ImageController.java
package Controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import Model.ImageManager;

/**
 * Controla la lógica de manejo de imágenes:
 * - Guardar imagen (copiar desde temp o ruta origen)
 * - Borrar imagen
 * - Renombrar (si hace falta)
 */
public class ImageController {

    private final ImageManager imageManager;

    public ImageController(ImageManager imageManager) {
        this.imageManager = imageManager;
    }

    /**
     * Copia la imagen desde la ruta origen a la carpeta images:
     * @param sourcePathString ruta completa al archivo de origen
     * @return true si se copió correctamente, false en caso contrario
     */
    public boolean saveImage(String sourcePathString) {
        try {
            Path source = Path.of(sourcePathString);
            if (!Files.exists(source)) {
                return false;
            }
            Path targetFolder = imageManager.getImagesDir();
            String fileName = source.getFileName().toString();
            Path target = targetFolder.resolve(fileName);
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Elimina una imagen (por nombre relativo). Ej: “monitor1.png”.
     * @param imageName nombre del archivo (sin ruta)
     * @return true si se eliminó, false si no existía
     */
    public boolean deleteImage(String imageName) {
        try {
            Path target = imageManager.getImagesDir().resolve(imageName);
            return Files.deleteIfExists(target);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Renombra una imagen existente en la carpeta de imágenes.
     * @param oldName nombre actual de la imagen (ej: “v1.png”)
     * @param newName nuevo nombre deseado (ej: “v2.png”)
     * @return true si se renombró correctamente, false si no existe o falla
     */
    public boolean renameImage(String oldName, String newName) {
        try {
            Path dir      = imageManager.getImagesDir();
            Path source   = dir.resolve(oldName);
            Path target   = dir.resolve(newName);
            if (!Files.exists(source)) {
                return false;
            }
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}

