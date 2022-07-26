package com.example.cdm.controllers;

import com.example.cdm.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MenuController {

    @FXML
    private ImageView Rutinas;

    @FXML
    private ImageView Suplementos;

    @FXML
    private ImageView EncontrarGym;

    @FXML
    private Button btnSalir;

    @FXML
    void btnOnSalirCliked(MouseEvent event) {
        HelloApplication.setFXML("Login-view","");
    }

    @FXML
    void btnOnMouseCliked(MouseEvent event) {
        HelloApplication.setFXML("MenuUsuario-view","MenuAlumno");

    }

}