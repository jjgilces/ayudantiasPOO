/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

/**
 *
 * @author johan_p9pyxb1
 */
public class Book {
    private String nombre;
    
    public Book(String n){
     nombre=n;
    }

    @Override
    public String toString() {
        return  nombre + '}';
    }
    
}
