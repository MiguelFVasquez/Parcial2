package co.edu.uniquindio.pr3.parcial2.viewControllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.pr3.parcial2.application.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class SegundaVentanaViewController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> tableView;
    private App aplicacion;
    private Stage stage;


    public void setAplicacion(App aplicacion) {
        this.aplicacion = aplicacion;

    }
    public void init(Stage stage2) {
        this.stage = stage2;
    }
    @FXML
    void initialize() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
