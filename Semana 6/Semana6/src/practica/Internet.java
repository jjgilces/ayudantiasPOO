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
public class Internet extends Servicio{
    private int vSubidad;
    private int vBajada; 
    
    public Internet(ArrayList<Sector> s, String d, String n, double p, int vs, int vb){
       super(s,d,n,p);
        vSubidad=vs;
        vBajada=vb;  
    }
    
    public int getvSubidad() {
        return vSubidad;
    }

    public void setvSubidad(int vSubidad) {
        this.vSubidad = vSubidad;
    }

    public int getvBajada() {
        return vBajada;
    }

    public void setvBajada(int vBajada) {
        this.vBajada = vBajada;
    }

    @Override
    public String toString() {
        return toString() + "vSubidad=" + vSubidad + ", vBajada=" + vBajada;
    }
    
    
    
    
}
