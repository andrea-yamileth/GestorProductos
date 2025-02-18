/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.gestorproductoscorreccion.modelo;


public class GestorProducto {
    int tamanoVector = 5;
    Producto[] productos = new Producto[tamanoVector];
    int cont = 0;

    public String agregarProducto(Producto producto) {
        String msg = "Ingreso exitoso";
        if (cont < productos.length) {
            productos[cont] = producto;
            cont++;
        } else {
            msg = "Ingreso no permitido, el vector esta lleno";
        }
        return msg;
    }

    public Producto[] listarProducto() {
        Producto[] auxProducto = new Producto[cont];
        System.arraycopy(productos, 0, auxProducto, 0, cont);
        return auxProducto;
    }

}