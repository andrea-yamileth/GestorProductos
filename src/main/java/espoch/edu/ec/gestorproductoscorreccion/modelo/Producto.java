/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.gestorproductoscorreccion.modelo;

/**
 *
 * @author LAPTOP DELL
 */
public class Producto {
    private int Id;
    private String Nombre;
    private double Precio; // Changed to double
    private boolean Disponible;

    public Producto(int Id, String Nombre, double Precio, boolean Disponible) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Disponible = Disponible;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() { // Changed to double
        return Precio;
    }

    public void setPrecio(double Precio) { // Changed to double
        this.Precio = Precio;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean Disponible) {
        this.Disponible = Disponible;
    }
}