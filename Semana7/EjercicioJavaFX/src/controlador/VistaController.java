
package controlador;

import static ejerciciojavafx.Main.compras;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import modelo.Compra;
import modelo.Pelicula;

/**
 * FXML Controller class
 *
 * @author johan_p9pyxb1
 */
public class VistaController implements Initializable {

    @FXML
    private HBox HBP; 
    @FXML
    private TextField txtNombre; 
    @FXML
    private TextField txtEntrada;
    @FXML
    private Button btnComprar; 
    
    private GeneradorPelicula generador;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        generador= new GeneradorPelicula(HBP);
        generador.crearPeliculas();
    }    
    
    public void clickComprar(ActionEvent e){
        String nombre= txtNombre.getText();
        int entradas= Integer.parseInt(txtEntrada.getText());
        Pelicula pSeleccionada= generador.getpSeleccionada();
        pSeleccionada.reducirPelicula(entradas);
        Compra c = new Compra(pSeleccionada,nombre,entradas);
        compras.add(c);
    }
    
}
