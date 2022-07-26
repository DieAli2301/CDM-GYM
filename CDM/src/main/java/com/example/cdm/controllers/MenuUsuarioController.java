package com.example.cdm.controllers;

import com.example.cdm.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MenuUsuarioController {

    @FXML
    private ImageView btnInfo;

    @FXML
    private Button btnRegresar;

    @FXML
    private ImageView btnRutinaD;

    @FXML
    private Button btnSalir;

    @FXML
    void btnOnRegresarCliked(MouseEvent event) {

        HelloApplication.setFXML("Menu-view","Redirect  Menu");
    }

    @FXML
    void btnOnSalirCliked(MouseEvent event) {
        HelloApplication.setFXML("Login-view","");
    }

    @FXML
    void btnOninfoClicked(MouseEvent event) {
        HelloApplication.setFXML("InfoDeportista-view","Redirect info");
    }

    @FXML
    void btnRutinaOnMouseClicked(MouseEvent event) {

        HelloApplication.setFXML("RutinaD-view","Redirect rutina");
    }

}
