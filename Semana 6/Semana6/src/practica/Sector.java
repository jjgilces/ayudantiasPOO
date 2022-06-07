/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Objects;

/**
 *
 * @author johan_p9pyxb1
 */
public class Sector {
    private String ciudad;
    private String barrio;

    public Sector(String ciudad, String barrio) {
        this.ciudad = ciudad;
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getBarrio() {
        return barrio;
    }
    
    
    //Hola.equals()

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object otro){
        if(this== otro){
            return true;
        }
        if(otro==null){
            return false;
        }
        if(getClass()!= otro.getClass()){
            return false;
        }
        Sector sector0= (Sector) otro;
        if(!ciudad.equals(sector0.ciudad)||!barrio.equals(sector0.barrio)){
            return false;
        }
        return true;
    }
}
