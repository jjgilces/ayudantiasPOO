/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana2;

/**
 *
 * @author johanjairgilcesreyes
 */
public class Pokemon {
    
    private String nombre; 
    private  int puntosvida; 
    private String tipo; //agua
    public static String pokebola="Standar";
    //crear el getters and setters puntos de vida y tipo
    
    public Pokemon (String nombre, int puntos, String tipo){
        this.nombre= nombre;
        this.puntosvida= puntos;
        this.tipo=tipo;
    }
    
   //get 
    public String getNombre(){
        return nombre;
    }
    //set
    public void setNombre(String nnombre){
        this.nombre=nnombre;
    }
    
    
    public String getTipo(){
        return tipo;
    }
    //set
    public void setTipo(String ntipo){
        this.tipo=ntipo;
    }
    
    public int getPuntosVida(){
        return puntosvida;
    }
    public void setPuntosVida(int puntos){
        this.puntosvida= puntos;
    }
}
