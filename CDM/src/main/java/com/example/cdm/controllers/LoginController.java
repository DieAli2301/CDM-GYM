package com.example.cdm.controllers;

import com.example.cdm.HelloApplication;
import com.example.cdm.models.BaseDatos;
import com.example.cdm.models.ValidateCoach;
import com.example.cdm.models.ValidateDeportista;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class
LoginController {
   public static String useringresado;

    @FXML
    private Button BtnIniciar;

    @FXML
    private Button BtnRegistrarse;

    @FXML
    private ComboBox<String> Cbox;

    @FXML
    private PasswordField Password;

    @FXML
    private TextField Username;

    @FXML
    private Button btnSalir;

    @FXML
    void BtnOnInicarCliked(MouseEvent event) {

        if (Cbox.getValue().equals("Coach")) {
            ValidateCoach user = new ValidateCoach();
            if (user.autenticarCoach(Username.getText(), Password.getText())) {
                useringresado=Username.getText();
                HelloApplication.setFXML("MenuCoach-view", "Home - menu");

            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Login - Error");
                alert.setContentText("El usuario no existe");
                alert.showAndWait();
            }
        }
        else {
            ValidateDeportista user = new ValidateDeportista();
            if (user.autenticarUser(Username.getText(), Password.getText())) {
                useringresado = Username.getText();
                HelloApplication.setFXML("Menu-view", "Home - menu");
            }else
            {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Login - Error");
                alert.setContentText("El usuario no existe");
                alert.showAndWait();
            }
        }

    }

    @FXML
    void btnOnRegistrarse(MouseEvent event) {
        HelloApplication.setFXML("Registrarse-view","redirect CA");

    }

    @FXML
    void btnOnSalirCliked(MouseEvent event) {

        System.exit(1);
    }

    @FXML
    void initialize() {
        String[] lista = {"Coach", "Deportista"};
        Cbox.getItems().addAll(lista);
        Cbox.getSelectionModel().selectFirst();
    }

}