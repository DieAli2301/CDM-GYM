package com.example.cdm.controllers;

import com.example.cdm.HelloApplication;
import com.example.cdm.models.BaseDatos;
import com.example.cdm.models.Deportista;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RegistrarDepController {

    @FXML
    private PasswordField Password;

    @FXML
    private Button backBtn;

    @FXML
    private Button btnGuardar;

    @FXML
    private TextField txtEstatura;

    @FXML
    private TextField txtPeso;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCorreoElec;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtUsername;


    @FXML
    public void btnBackOnMosueCliked(MouseEvent mouseEvent) {
        HelloApplication.setFXML("Registrarse-view","");
    }

    public void BtnOnMouseGuardarCliked(MouseEvent mouseEvent) {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int edad = Integer.valueOf(txtEdad.getText());
        int estatura = Integer.valueOf(txtEstatura.getText());
        float peso = Integer.valueOf(txtPeso.getText());
        String correo = txtCorreoElec.getText();
        String User = txtUsername.getText();
        String contraseña = Password.getText();
        Deportista deportista = new Deportista(nombre,apellido,edad,correo,peso,estatura,User,contraseña);
        BaseDatos.deportista.add(deportista);
        HelloApplication.setFXML("Login-view","");
    }
}