/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana2;

/**
 *
 * @author johanjairgilcesreyes
 */
public class Punto {
    int puntoX;
    int puntoY; 
    
    
    //Sobre carga--> agregando mas atributos 
    //constructor que solo recibe 'x" e inicializa "y" en 7; 
//    public Punto(int x){
//        puntoX= x;
//        puntoY=7;
//    }
     //constructor que solo recibe "y" y inicializa X en 5; 
    
    public Punto(int y){
        puntoY=y;
        puntoX=5;
    }
    //CONSTRUCTOR QUE RECIBE AMBOS
    public Punto(int puntoX, int y){
        this.puntoX=puntoX;
        puntoY=y;
    }
    
    //CONSTRUCTOR que no recibe argumentos e inicializa las variables en 10
    public Punto(){
        
    }
   
    
}
