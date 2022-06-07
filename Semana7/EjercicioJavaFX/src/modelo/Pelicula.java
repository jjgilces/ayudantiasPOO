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
public class Pelicula implements Serializable{
    private String nombre;
    private String  rutaPoste;
    private int entradasDisponibles;
    private String      genero;
    private String cine;

    public Pelicula(String nombre, String rutaPoste, int entradasDisponibles, String genero, String cine) {
        this.nombre = nombre;
        this.rutaPoste = rutaPoste;
        this.entradasDisponibles = entradasDisponibles;
        this.genero = genero;
        this.cine = cine;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutaPoste() {
        return rutaPoste;
    }

    public void setRutaPoste(String rutaPoste) {
        this.rutaPoste = rutaPoste;
    }

    public int getEntradasDisponibles() {
        return entradasDisponibles;
    }

    public void setEntradasDisponibles(int entradasDisponibles) {
        this.entradasDisponibles = entradasDisponibles;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCine() {
        return cine;
    }

    public void setCine(String cine) {
        this.cine = cine;
    }

    public void reducirPelicula(int n){
        entradasDisponibles-=n;
    }
    @Override
    public String toString() {
        return  nombre + "-  disponibles: " + entradasDisponibles ;
    }
    
    
    
}
