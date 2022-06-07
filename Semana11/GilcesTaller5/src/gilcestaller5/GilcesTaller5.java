
package gilcestaller5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import modelo.Pelicula;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import modelo.Orden;

/**
 *
 * @author Johan
 */
public class GilcesTaller5 extends Application{
    public static boolean abierto=true;
    public static  ArrayList<Pelicula> Peliculas= new ArrayList<>();
    public static  ArrayList<Orden> ArregloOrdenes = new ArrayList<>();
    public static Pelicula pCompra = new Pelicula();
     
     public static void leerArchivoPeliculas(){
        try {
            List<String> lineas = Files.readAllLines(Paths.get("src/recursos/peliculas.txt"));
            lineas.remove(0);
            for (String l : lineas) {
                String[] lSe = l.split(",");
                int entradas = Integer.parseInt(lSe[2]);
                Pelicula c = new Pelicula(lSe[0],lSe[1],entradas,lSe[3],lSe[4]);
                Peliculas.add(c);
                //Pelicula,rutaPoster,entradasDisponibles,genero,cine
            }
            System.out.println(Peliculas);
        } catch (IOException ex) {
            System.out.println("Error no se encontró archivo");
        }
    }
    public static void main(String[] args) {
        deserializar();
        leerArchivoPeliculas();
        launch(args);
        serializar();
          
    }
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/vista/Vista.fxml"));
        Scene scene = new Scene(root);
        Image image = new Image("recursos/2.png");  //pass in the image path
        scene.setCursor(new ImageCursor(image));
        stage.setTitle("NOTICIAS");
        stage.setScene(scene);
        stage.setOnCloseRequest(e-> abierto=false);
        stage.show();
    }
     public static void serializar() {
        try {
            try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("src/recursos/OrdenesCompradas"))) {
                os.writeObject(ArregloOrdenes);
            }
        } 
        catch (FileNotFoundException ex) {
            System.out.println("no se encuentra el archivo"+ex);
        } 
        catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void deserializar() {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("src/recursos/OrdenesCompradas"))) {
            ArregloOrdenes = (ArrayList<Orden>) is.readObject();
            System.out.println("Deserealizacion exitosa");

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error en deserialización: " + ex);
        }
    }
}
