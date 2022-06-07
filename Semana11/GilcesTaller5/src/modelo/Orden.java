/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Orden implements Serializable{
    
    private String usuario;
    private int totalP;
    private Pelicula pelicula;

    public Orden(String usuario, int totalP, Pelicula pelicula) {
        this.usuario = usuario;
        this.totalP = totalP;
        this.pelicula = pelicula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

  
    public double getTotalP() {
        return totalP;
    }

    public void setTotalP(int totalP) {
        this.totalP = totalP;
    }

    @Override
    public String toString() {
        return usuario +pelicula+ totalP ;
    }
    


}
