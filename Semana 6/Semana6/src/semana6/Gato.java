
package semana6;

/**
 *
 * @author johan_p9pyxb1
 */
public class Gato extends Animal{
    
    
   public Gato(int n){    
       System.out.println("Soy un gato");
   }
   public void eat(){
       super.eat();
       System.out.println("Gatito Comiendo");
   }
}
