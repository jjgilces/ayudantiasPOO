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
public class Prueba {
    int x;
    
    Prueba(String s){
        this();
        System.out.println(s);
        System.out.println("Esto");
    }
    Prueba(int x){
        this("es");
                 
    }
    Prueba(){
        System.out.println("Una prueba");
    }
    
    public static void main(String[] args) {
        int va=2;
        Prueba p= new Prueba(2);
    }
    
}
