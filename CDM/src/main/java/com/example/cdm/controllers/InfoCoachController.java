package com.example.cdm.controllers;

import com.example.cdm.HelloApplication;
import com.example.cdm.models.BaseDatos;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class InfoCoachController {

    @FXML
    private Button BtnRegresar;

    @FXML
    private Button btnMostrar;

    @FXML
    private Button btnSalir;

    @FXML
    private TextArea txtArea;

    @FXML
    void OnMostrarClicked(MouseEvent event) {
        String totalimpresion1 = "";
        for (int i = 0; i < BaseDatos.coach.size(); i++) {
            totalimpresion1 = BaseDatos.coach.get(i).toString();
        }
        txtArea.setText(totalimpresion1);
    }

    @FXML
    void OntxtAreaClicked(MouseEvent event) {

    }

    @FXML
    void btnOnRegresarCliked(MouseEvent event) {
        HelloApplication.setFXML("MenuCoach-view","Redirect info");
    }

    @FXML
    void btnOnSalirCliked(MouseEvent event) {
        HelloApplication.setFXML("Login-view","");
    }

}
