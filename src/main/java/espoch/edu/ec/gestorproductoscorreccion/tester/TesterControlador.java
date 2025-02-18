/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.gestorproductoscorreccion.tester;

import espoch.edu.ec.gestorproductoscorreccion.modelo.Producto;

/**
 *
 * @author LAPTOP DELL
 */
public class TesterControlador {
    public void prueba(Producto objProducto) {
        System.out.println("Id: " + objProducto.getId());
        System.out.println("Nombre: " + objProducto.getNombre());
        System.out.println("Precio: " + objProducto.getPrecio());
        System.out.println("Disponible: " + objProducto.isDisponible());
        
    }
    
}
