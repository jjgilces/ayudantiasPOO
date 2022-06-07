/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author johan_p9pyxb1
 */
public abstract class Espectaculo {
    private String codigo; 
    private int capacidad; 
    private ArrayList<Funcion> funciones; 

    public Espectaculo(String codigo, int capacidad) {
        this.codigo = codigo;
        this.capacidad = capacidad;
        funciones= new ArrayList<>();
    }

    public Espectaculo(int capacidad) {
        this.capacidad = capacidad;
        funciones= new ArrayList<>();

    }
    public int generarCodigo(){
        return 1; 
    }
    
    public void agregarFuncion(LocalDateTime f, double p){
        Funcion f1= new Funcion(f,p);
        funciones.add(f1);
        
    }
    public  String toCSV(){
        String s="";
        s+= codigo+","+capacidad;
        for(Funcion f: funciones){
            s+=f.toString();
            s+=";";
        }
        return s; 
    }
    
}
