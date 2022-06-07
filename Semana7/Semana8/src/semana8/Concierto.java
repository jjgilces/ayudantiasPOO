/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

import java.io.Serializable;

/**
 *
 * @author johan_p9pyxb1
 */
public class Concierto implements Serializable{
    private Artista artista;
    private String name; 

    public Concierto(String name) {
        this.name = name;
    }

    
    
    public Concierto(Artista artista, String name) {
        this.artista = artista;
        this.name = name;
    }
    
    
}
