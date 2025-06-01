/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// FormController.java
// FormController.java
package Controller;

import Model.Brand;
import Model.Category;
import Model.Product;

/**
 * Construye objetos Product a partir de datos primitivos (simulando un formulario).
 * Separa la lógica de “tomar datos crudos” y “crear el modelo” para que la vista solo
 * envíe strings y números.
 */
public class FormController {

    public FormController() {
        // No hay estado interno; método estático alternativo hubiera servido
    }

    /**
     * Construye un Product a partir de campos recibidos (por ejemplo, desde JTextFields).
     * @param id          ID del producto
     * @param name        Nombre breve
     * @param description Descripción larga
     * @param category    Objeto Category ya construido por la vista
     * @param brand       Objeto Brand ya construido por la vista
     * @param price       Precio numérico
     * @param quantity    Cantidad entera
     * @param imagePath   Nombre/ruta de la imagen
     * @return instancia de Product lista para pasarse a ProductController
     */
    public Product buildProduct(
            String id,
            String name,
            String description,
            Category category,
            Brand brand,
            double price,
            int quantity,
            String imagePath) {

        Product p = new Product();
        p.setId(id);
        p.setName(name);
        p.setDescription(description);
        p.setCategory(category);
        p.setBrand(brand);
        p.setPrice(price);
        p.setQuantity(quantity);
        p.setImagePath(imagePath);
        return p;
    }
}


