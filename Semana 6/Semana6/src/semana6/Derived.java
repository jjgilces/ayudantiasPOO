/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6;

/**
 *
 * @author johan_p9pyxb1
 */
public class Derived extends Base{
    Derived(){
        super("Derivada");
        System.out.println("Derivada");
        
    }
    
    Derived(String n){
        System.out.println("Derivada con parametro"+n);
    }
    
    
}
