
package semana8;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author johan_p9pyxb1
 */
public class Robot implements Serializable{
    private String nombre;
    private transient int edad; 
    private String id; 
    private double precio;
    
    public Robot(String nombre) {
        this.nombre = nombre;
    }

    public Robot(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public Robot(String nombre, int edad, String id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public int pedirKilometroje()  {
        int d;
        Scanner sc = new Scanner(System.in);
        d=sc.nextInt();
        if(d<100)
            throw new NumeroMenorException();
        return d;
    }
    
    @Override
    public String toString() {
        return  nombre + ", edad=" + edad + ", id=" + id ;
    }
    
    
}
