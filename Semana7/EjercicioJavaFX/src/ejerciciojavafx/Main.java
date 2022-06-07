
package ejerciciojavafx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import modelo.Compra;
import modelo.Pelicula;

/**
 *
 * @author johan_p9pyxb1
 */
public class Main extends Application{
    public static ArrayList<Pelicula> peliculas= new ArrayList<>();
    public static ArrayList<Compra> compras= new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        deserializar();
        leerArchivoPeliculas();
        launch(args);
        serializar();
        System.out.println(compras);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../vista/Vista.fxml"));
        Scene scene = new Scene(root);
        Image image= new Image(new FileInputStream("src/recursos/2.png"));
        scene.setCursor(new ImageCursor(image));
        stage.setTitle("Cine");      
        stage.setScene(scene);
        
        stage.show();
                
    }
    
    public static void leerArchivoPeliculas(){
        try{
            List<String> lineas= Files.readAllLines(Paths.get("src/recursos/peliculas.txt"));
            lineas.remove(0);
            for( String linea: lineas){
                //Pelicula,rutaPoster,entradasDisponibles,genero,cine
                String[] sepa= linea.split(","); 
                int entradas= Integer.parseInt(sepa[2]);
                Pelicula p = new Pelicula(sepa[0], sepa[1], entradas, sepa[2], sepa[3]);
                peliculas.add(p);
            }
            
        }catch(IOException ex){
            System.out.println("no encuentro el archivo peliculas.txt");
        } 
    }
    
    public static void serializar(){
        try(ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream("src/recursos/compras"))) {
            os.writeObject(compras);
        } catch (FileNotFoundException ex) {
            System.out.println("no esta el archivo");
        } catch (IOException ex) {
            System.out.println("no se pudo serializar el archivo ");
        }
    }
    
     public static void deserializar(){
        try(ObjectInputStream os= new ObjectInputStream(new FileInputStream("src/recursos/compras"))) {
            compras=(ArrayList<Compra>) os.readObject();
            System.out.println("deserialziacion exitosa");
        } catch (FileNotFoundException ex) {
            System.out.println("no esta el archivo");
        } catch (IOException ex) {
            System.out.println("no se pudo deserializar el archivo ");
        } catch (ClassNotFoundException ex) {
            System.out.println("no se encuentra esa clase");
        }
    }
}
