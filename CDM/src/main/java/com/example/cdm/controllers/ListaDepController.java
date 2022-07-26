package com.example.cdm.controllers;

import com.example.cdm.HelloApplication;
import com.example.cdm.models.BaseDatos;
import com.example.cdm.models.Coach;
import com.example.cdm.models.Deportista;
import com.example.cdm.models.Rutina;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ListaDepController {

    @FXML
    private ComboBox<String> ComBox;

    @FXML
    private TextArea txtRutina;

    @FXML
    private Button botonGuardar;

    @FXML
    private Button btnRegresar1;

    @FXML
    private Button btnSalir;

    @FXML
    void OnbtnGuardarClicked(MouseEvent event) {
        String rutinas = txtRutina.getText();
        Rutina rutina = new Rutina(rutinas);
        BaseDatos.rutina.add(rutina);
    }

    @FXML
    void btnOnMouseClikedRegresar1(MouseEvent event) {
        HelloApplication.setFXML("MenuCoach-view","");
    }

    @FXML
    void btnOnSalirCliked(MouseEvent event) {
        HelloApplication.setFXML("Login-view","");
    }

    @FXML
    void initialize() {
        for (Deportista item: BaseDatos.deportista)
            ComBox.getItems().add(item.getNombre());
        ComBox.getSelectionModel().selectFirst();
    }
}