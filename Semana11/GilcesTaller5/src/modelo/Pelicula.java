/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author JOhan
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Johan
 */
public class Pelicula implements Serializable{
    private String nombre;
    private String urlImagen;
    private int entradas;
    private String genero;
    private String cine;

    public Pelicula(String nombre, String urlImagen, int entradas, String genero, String cine) {
        this.nombre = nombre;
        this.urlImagen = urlImagen;
        this.entradas = entradas;
        this.genero = genero;
        this.cine = cine;
    }

    public Pelicula() {
    }
     
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }


    public String getGenero() {
        return genero;
    }
  public void reducirPelicula(int c){
        this.entradas-=c;
    }

    public int getEntradas() {
        return entradas;
    }

    public String getCine() {
        return cine;
    }


    @Override
    public String toString() {
        return  nombre ;
    }

    
}
