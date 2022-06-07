/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static controlador.VistaController.mostrarAlerta;
import static gilcestaller5.GilcesTaller5.ArregloOrdenes;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import modelo.Pelicula;
import static gilcestaller5.GilcesTaller5.Peliculas;
import javafx.scene.control.Alert;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import modelo.Orden;

/**
 *
 * @author Johan
 */
public class GeneradorPelicula {
    private HBox HBP;
    private TextField txtNombre;
    private TextField txtEntradas;
    private Pelicula pSeleccionada;
    public GeneradorPelicula(HBox HBP) {
        this.HBP = HBP;
    }
     
    
    public void crearPeliculas(){
        for(Pelicula peli: Peliculas){
            ImageView img = new ImageView();
            img.scaleXProperty().add(10);        
            img.setImage(new Image("/recursos/"+peli.getUrlImagen()));
            img.setFitWidth(200);
            img.setFitHeight(230);
            Button b= new Button();  
            b.setGraphic(img);
            b.autosize();
            b.setText(peli.getNombre());
            b.setContentDisplay(ContentDisplay.TOP);
            b.setWrapText(true);
            b.setOnAction(e -> { pSeleccionada=peli;});
         
            HBP.getChildren().add(b);
        }
        
    }

    public Pelicula getpSeleccionada() {
        return pSeleccionada;
    }

    public void setpSeleccionada(Pelicula pSeleccionada) {
        this.pSeleccionada = pSeleccionada;
    }
 


}
