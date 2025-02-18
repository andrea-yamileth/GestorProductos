/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.gestorproductoscorreccion.controlador;

import espoch.edu.ec.gestorproductoscorreccion.GestorProductosCorreccion;
import espoch.edu.ec.gestorproductoscorreccion.modelo.GestorProducto;
import espoch.edu.ec.gestorproductoscorreccion.modelo.Producto;
import espoch.edu.ec.gestorproductoscorreccion.vista.ListarIU;
import espoch.edu.ec.gestorproductoscorreccion.vista.Principal;


public class Controlador {
    private Principal principal;
    private GestorProducto gestorProductosCorreccion;
    private ListarIU listarIU;

    public Controlador(Principal principal, ListarIU listarIU) {
        this.principal = principal;
        this.listarIU = listarIU;
        this.gestorProductosCorreccion = new GestorProducto();
    }

    public void agregarProducto() {
        try {
            String idStr = principal.getId();
            String nombre = principal.getNombre();
            String precioStr = principal.getPrecio();
            boolean disponible = principal.getDisponible();

            if (idStr.isEmpty() || nombre.isEmpty() || precioStr.isEmpty()) {
                principal.error("Completa todos los datos!");
                return; // Stop further execution
            }

            int id = Integer.parseInt(idStr);
            double precio = Double.parseDouble(precioStr);


            Producto objProducto = new Producto(id, nombre, precio, disponible);// Use the constructor

            String msm = gestorProductosCorreccion.agregarProducto(objProducto);
            principal.error(msm);
            if (msm.equals("Ingreso exitoso")) {
            principal.limpiar(); // Limpiar campos del formulario
            principal.error("Datos ingresados correctamente"); // Mostrar mensaje en lbdError
        }

    } catch (NumberFormatException e) {
        principal.error("ID y Precio deben ser números.");
    } catch (Exception e) {
        principal.error("Error: " + e.getMessage());
    }
    }

    public void listarProducto() {
        try {
            String msm = "";
            Producto[] productos = gestorProductosCorreccion.listarProducto();

            if (productos != null && productos.length > 0) { // Check if the array is not null and not empty
                for (Producto producto : productos) {
                    if (producto != null) { // Check for null products in the array
                        msm += "Id: " + producto.getId() + "\n"
                                + "Nombre: " + producto.getNombre() + "\n"
                                + "Precio: " + producto.getPrecio() + "\n"
                                + "Disponible: " + producto.isDisponible() + "\n\n"; // Added extra newline for spacing
                    }
                }
            } else {
                msm = "No hay datos que mostrar";
            }
            listarIU.mostrarDatos(msm);
        } catch (Exception e) {
            System.out.println("Error Controlador-listarProductos: " + e);
        }
    }
}
    

