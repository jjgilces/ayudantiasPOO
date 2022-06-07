
package semana8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author johan_p9pyxb1
 */
public class Semana8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot r = new Robot("Bender",18,"E120"); 
        String archivo = "Datos";
        Robot r2 = new Robot("Carlos"); 
        Robot r3 = new Robot("Pepe",13.3); 
        Artista a = new Artista("Bad bunny");
        Concierto c = new Concierto(a,"Coachella");
        
        r.pedirKilometroje();
        
//        ArrayList<Robot> lista= new ArrayList<>();
//        lista.add(r);
//        lista.add(r2);
//        lista.add(r3);
        ArrayList<Robot> robots=null; 
//        Robot robot=null;
        try{
        FileInputStream file  = new FileInputStream(archivo);
        ObjectInputStream in = new ObjectInputStream(file);
        robots =(ArrayList<Robot>) in.readObject();
        file.close();
        in.close();
        }catch(FileNotFoundException e){
            System.out.println("NO SE ENCUENTRA EL ARCHIVO");
        }
        catch(IOException ex){
            System.err.println(ex);
        } catch (ClassNotFoundException ex) {
             System.err.println(ex);
        }
        catch(Exception e){
            System.out.println("NO ES FILE NO ES IO NO ES CLASS");
        }
        System.out.println(robots);

        //Lanzar una excepcion si el numero es menor a 100 
        
        
        
//        try{
//        FileOutputStream file  = new FileOutputStream(archivo);
//        ObjectOutputStream out = new ObjectOutputStream(file);
//        
//        //Escribe el objeto en el archivo 
//        out.writeObject(lista);
//   
//        System.out.println("Serializando archivo...");
//        file.close();
//        out.close();
//        } catch(FileNotFoundException e){
//            System.err.println(e);
//        }catch (IOException e){
//            System.err.println(e);
//        }
    }
    
}
