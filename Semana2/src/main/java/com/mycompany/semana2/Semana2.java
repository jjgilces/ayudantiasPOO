/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.semana2;

/**
 *
 * @author johanjairgilcesreyes
 */
public class Semana2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //como instancio un objeto? --> new 
        Pokemon pk1= new Pokemon("Charizard",10,"Fuego");
        
        System.out.println(pk1.getNombre()); 
         System.out.println(pk1.getPuntosVida());
         System.out.println(pk1.getTipo());
         pk1.setPuntosVida(50);
         
         System.out.println(pk1.getPuntosVida());
         
          Pokemon pk2= new Pokemon("Pikachu",8,"Electrico");
          
          System.out.println(pk2.getTipo());
          
         System.out.println(Pokemon.pokebola);
         System.out.println(Pokemon.pokebola);
        //System.out.println(pk1.nombre);
//        System.out.println(pk1.puntosvida);
//        System.out.println(pk1.tipo);
        Pokemon.
       //100  -->  30  -->70 
       

      
    }
}
