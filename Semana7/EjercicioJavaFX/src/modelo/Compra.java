/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author johan_p9pyxb1
 */
public class Compra implements Serializable{
    Pelicula p; 
    String nombre; 
    int entradas; 

    public Compra(Pelicula p, String nombre, int entradas) {
        this.p = p;
        this.nombre = nombre;
        this.entradas = entradas;
    }

    @Override
    public String toString() {
        return  p + ", nombre=" + nombre + ", entradas=" + entradas ;
    }
    
}
