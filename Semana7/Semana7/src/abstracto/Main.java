
package abstracto;

/**
 *
 * @author johan_p9pyxb1
 */
public class Main {
    
    public static void main(String[] args) {
        Perro p = new Perro("Scot");
        Canino c=  new Perro("Canino");
        
        p.presentarse();
        c.presentarse();
        Canino.comer();
    }
   
    
}
