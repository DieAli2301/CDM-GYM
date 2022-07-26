package com.example.cdm.controllers;

import com.example.cdm.HelloApplication;
import com.example.cdm.models.BaseDatos;
import com.example.cdm.models.Coach;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RegistrarCoachController {

    @FXML
    private PasswordField Password;

    @FXML
    private Button backBtn;

    @FXML
    private Button btnGuardar;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCorreoElec;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNombreGym;

    @FXML
    private TextField txtUsername;


    @FXML
    void BtnOnMouseGuardarCliked(MouseEvent event) {
        String nombre = txtNombre.getText();
        String apellidos = txtApellido.getText();
        int edad = Integer.valueOf(txtEdad.getText());
        String correo = txtCorreoElec.getText();
        String User = txtUsername.getText();
        String contraseña = Password.getText();
        Coach coach = new Coach(nombre,apellidos,edad,correo,User,contraseña);
        BaseDatos.coach.add(coach);
           HelloApplication.setFXML("Login-view","");
    }

    @FXML
    void btnBackOnMosueCliked(MouseEvent event) {
        HelloApplication.setFXML("Registrarse-view","");

    }

}