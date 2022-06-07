/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto;

/**
 *
 * @author johan_p9pyxb1
 */
public class Circulo extends Figura{
    private float pi=3.1416f;

    @Override
    public float area() {
        return pi *2;
    }
    
    
}
