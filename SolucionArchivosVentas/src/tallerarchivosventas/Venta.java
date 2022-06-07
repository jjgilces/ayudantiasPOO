/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerarchivosventas;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Venta implements Serializable{
    private double valor;
    private String detalle;
    private static final long serialVersionUID =1;

    public Venta(double valor) {
        this.valor = valor;
    }

   

    public double getValor() {
        return valor;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    
    
   
}
