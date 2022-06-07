/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static gilcestaller5.GilcesTaller5.ArregloOrdenes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import modelo.Orden;
import modelo.Pelicula;

/**
 * FXML Controller class
 *
 * @author user
 */
public class VistaController implements Initializable {

    @FXML
    private HBox HBP;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtEntradas;
    @FXML
    private Button btComprar;
    
    private GeneradorPelicula generador;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       generador= new GeneradorPelicula(HBP);
       generador.crearPeliculas();
        
    }    
    
    public static void mostrarAlerta(String mensaje, Alert.AlertType e) {
        Alert alert = new Alert(e);
        alert.setTitle("");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
          
 
    public void clickComprar(ActionEvent e) {
        try {
            String usuario = txtNombre.getText();
            int entradas = Integer.parseInt(txtEntradas.getText());            
            if (!txtNombre.getText().isEmpty()) {                
                Pelicula p = generador.getpSeleccionada();
                if (p.getEntradas() >= entradas) {
                    Orden orden = new Orden(usuario, entradas, p);
                    System.out.println(orden);
                    p.reducirPelicula(entradas);
                    System.out.println("numero de entradas despues de la compra "+p.getEntradas());
                    ArregloOrdenes.add(orden);
                    mostrarAlerta("Compra realizada Correctamente!", Alert.AlertType.INFORMATION);
                } else {
                    mostrarAlerta("No contamos con suficientes entradas ):", Alert.AlertType.INFORMATION);
                }
            } else {
                mostrarAlerta("Ingese su nombre por favor", Alert.AlertType.ERROR);
            }
        } catch (NumberFormatException ex) {
            System.out.println(ex);
            txtNombre.clear();
            txtEntradas.clear();
            mostrarAlerta("Entradas ingresada no es valida!", Alert.AlertType.ERROR);
        }
    }
}
