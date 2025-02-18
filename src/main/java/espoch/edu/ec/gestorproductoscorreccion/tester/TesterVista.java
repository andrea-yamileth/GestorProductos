/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.gestorproductoscorreccion.tester;

import espoch.edu.ec.gestorproductoscorreccion.vista.Principal;


public class TesterVista {
    private Principal principal;

    public TesterVista(Principal principal) {
        this.principal = principal;
    }

    public void prueba() {
        //Principal principal=new Principal();
        try {
            System.out.println("Id: " + principal.getId());
            System.out.println("Nombre: " + principal.getNombre());
            System.out.println("Precio: " + principal.getPrecio());
            System.out.println("Disponible: "+ principal.getDisponible());
            
           } catch (NumberFormatException e) {
    
}
    }
}
    