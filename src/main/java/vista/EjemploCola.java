/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import cola.Cola;
import modelo.Personas;

/**
 *
 * @author cristian_andres.mera
 */
public class EjemploCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cola<Personas> colaP = new Cola<>();
        colaP.encolar(new Personas("Cristian", "cristian@uao.edu.co"));
        colaP.encolar(new Personas("Juan", "juan@uao.edu.co"));
        colaP.encolar(new Personas("Samuel", "samuel@uao.edu.co"));
        
        System.out.println("Elementos en cola " + colaP.toString());
        
        for (int i = 0; i < 3; i++) {
            if(!colaP.estaVacia()){
                colaP.desencolar();
                System.out.println("Elementos en cola " + colaP.toString());
            }else{
                System.out.println("Cola Vacía");
            }
        }
        
        
        
    }
    
}
