/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.ArrayList;

/**
 *
 * @author johan_p9pyxb1
 */
public abstract class Servicio {
    private ArrayList<Sector> sectoresDisponibles;
    private String descripcion;
    private String name;
    private double precio;

    public Servicio(ArrayList<Sector> sectoresDisponibles, String descripcion, String name, double precio) {
        this.sectoresDisponibles = sectoresDisponibles;
        this.descripcion = descripcion;
        this.name = name;
        this.precio = precio;
    }
    
   
  

    public ArrayList<Sector> getSectoresDisponibles() {
        return sectoresDisponibles;
    }

    public void setSectoresDisponibles(ArrayList<Sector> sectoresDisponibles) {
        this.sectoresDisponibles = sectoresDisponibles;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
   public String toString(){
       return name+""+descripcion+""+precio; 
       
       
   }
}
