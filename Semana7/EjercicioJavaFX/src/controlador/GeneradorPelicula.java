/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static ejerciciojavafx.Main.peliculas;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import modelo.Pelicula;

/**
 *
 * @author johan_p9pyxb1
 */
public class GeneradorPelicula {
    private HBox HBP; 
    private Pelicula pSeleccionada; 

    public GeneradorPelicula(HBox HBP) {
        this.HBP = HBP;
    }
    
    public void crearPeliculas(){
        for(Pelicula p: peliculas){
            ImageView img = new ImageView(); 
            img.scaleXProperty().add(10);
            img.setImage(new Image("/recursos/"+p.getRutaPoste()));
            img.setFitWidth(150);
            img.setFitHeight(180);
            Button b = new Button(); 
            b.setGraphic(img);
            b.autosize();
            b.setText(p.getNombre());
            b.setContentDisplay(ContentDisplay.TOP);
            b.setWrapText(true);     
            b.setOnAction(e->
            {
                pSeleccionada=p;
                System.out.println(p);
            }
            );
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
