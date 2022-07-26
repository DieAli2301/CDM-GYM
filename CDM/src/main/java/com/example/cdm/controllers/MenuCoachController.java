package com.example.cdm.controllers;

import com.example.cdm.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MenuCoachController {

    @FXML
    private ImageView btnInfoCoach;

    @FXML
    private ImageView btnRut1;

    @FXML
    private Button btnSalir;

    @FXML
    void btnInfoCoachClicked(MouseEvent event) {
        HelloApplication.setFXML("InfoCoach-view","");
    }

    @FXML
    void btnOnSalirCliked(MouseEvent event) {
        HelloApplication.setFXML("Login-view","");
    }
    @FXML
    void btnOnClicked(MouseEvent event) {
        HelloApplication.setFXML("ListaDep-view","jsjsjs");
    }
}