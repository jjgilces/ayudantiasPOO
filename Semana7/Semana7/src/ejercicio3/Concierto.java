/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.time.LocalDateTime;

/**
 *
 * @author johan_p9pyxb1
 */
public class Concierto extends Espectaculo{
    String banda; 
//    “cod, capacidad, fechaFuncion1| precio1; fechaFuncion2| precio2,banda”

    public Concierto(String codigo, int capacidad,String banda) {
        super(codigo, capacidad);
        this.banda = banda;
    }


    public Concierto fromCSV(String s){
       String[] datos = s.split(",");
       String codigo= datos[0];
       int c= Integer.parseInt(datos[1]);
       String b= datos[-1];
       Concierto co= new Concierto(codigo, c, b);
       String[] funciones= datos[2].split(";");
       for (String fun:funciones){
           String fecha = fun.split("|")[0];
           LocalDateTime datetime1 = LocalDateTime.of(2017, 1, 14, 10, 34);  
           double precio = Double.parseDouble(fun.split("|")[1]);
           co.agregarFuncion(datetime1, precio);
       }
       return co;
      
    }
    
}
