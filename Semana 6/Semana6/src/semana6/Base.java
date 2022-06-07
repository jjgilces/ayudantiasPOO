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
public class Base {
    String name; 
    Base(){
        this("por defecto");
        System.out.println("Base");
    }
    Base(String n){
        name=n;
        System.out.println("Base de"+name);
    }
    
    //base de por defecto 
    //base
}
