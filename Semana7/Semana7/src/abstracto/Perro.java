
package abstracto;

/**
 *
 * @author johan_p9pyxb1
 */
public class Perro implements Canino{
    private String name;

    public Perro(String name) {
        this.name = name;
    }
   
    
    
    @Override
    public void ladrar() {
        System.out.println("estoy ladrando ");
    }

    @Override
    public void presentarse() {
        System.out.println("Hola soy"+name);
    }
    
}
