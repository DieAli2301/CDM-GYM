package com.example.cdm.controllers;

import com.example.cdm.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class RegistrarseController {

    @FXML
    private ImageView btnCoach;

    @FXML
    private Button backBtn3;

    @FXML
    private ImageView btnDeportista;


    @FXML
    void btnOnMouseClikedDep(MouseEvent event) {
        HelloApplication.setFXML("RegistraseDep-view","redirect Mnu Dep");

    }

    @FXML
    void btnOnMouseCoachCliked(MouseEvent event) {
        HelloApplication.setFXML("RegistrarseCoach-view","redirect Mnu Coach");

    }

    @FXML
    void btnBackOnMosueCliked3(MouseEvent event) {
        HelloApplication.setFXML("Login-view","");

    }

}