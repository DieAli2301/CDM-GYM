package com.example.cdm.controllers;

import com.example.cdm.HelloApplication;
import com.example.cdm.models.BaseDatos;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class verRutinasDep {

    @FXML
    private Button btnRegresar;

    @FXML
    private Button btnRutina;

    @FXML
    private Button btnSalir;

    @FXML
    private TextArea txtArea;

    @FXML
    void btnOnMiRutinaCliked(MouseEvent event) {
        String mirutina = "";
        for (int i = 0; i < BaseDatos.rutina.size(); i++) {
            mirutina = BaseDatos.rutina.get(i).toString();
        }
        txtArea.setText(mirutina);
    }

    @FXML
    void btnOnRegresarCliked(MouseEvent event) {
        HelloApplication.setFXML("MenuUsuario-view","Redirect  Menu");
    }

    @FXML
    void btnOnSalirCliked(MouseEvent event) {
        HelloApplication.setFXML("Login-view","");
    }
}