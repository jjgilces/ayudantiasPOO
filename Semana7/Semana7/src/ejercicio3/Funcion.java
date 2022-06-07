/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.time.LocalDateTime;

/**
 *
 * @author johan_p9pyxb1
 */
public class Funcion {
    private LocalDateTime fecha;
    private double precio;
    private Espectaculo espectaculo;

    public Funcion(LocalDateTime fecha, double precio) {
        this.fecha = fecha;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  fecha + "|" + precio ;
    }
    
    
}
