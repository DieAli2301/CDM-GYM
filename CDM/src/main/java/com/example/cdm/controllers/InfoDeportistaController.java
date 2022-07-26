package com.example.cdm.controllers;

import com.example.cdm.HelloApplication;
import com.example.cdm.models.BaseDatos;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class InfoDeportistaController {

    @FXML
    private Button btnMostrar;

    @FXML
    private Button btnRegresar;

    @FXML
    private Button btnSalir;

    @FXML
    private TextArea txtArea;

    @FXML
    void OnMostrarClicked(MouseEvent event) {
        String totalimpresion = "";
        for (int i = 0; i < BaseDatos.deportista.size(); i++) {
            totalimpresion = BaseDatos.deportista.get(i).toString();
        }
        txtArea.setText(totalimpresion);
    }

    @FXML
    void OntxtAreaClicked(MouseEvent event) {

    }

    @FXML
    void btnOnRegresarCliked(MouseEvent event) {
        HelloApplication.setFXML("MenuUsuario-view", "Redirect info");
    }

    @FXML
    void btnOnSalirCliked(MouseEvent event) {
        HelloApplication.setFXML("Login-view","");
    }
}
