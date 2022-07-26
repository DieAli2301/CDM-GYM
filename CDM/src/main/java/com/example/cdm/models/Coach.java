package com.example.cdm.models;

public class Coach extends Usuarios{


    String Username;
    String Password;

    public Coach() {
    }

    public Coach(String nombre, String apellido, int edad, String correo, String username, String password) {
        super(nombre, apellido, edad, correo);
        Username = username;
        Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "\n Coach" +
                "\n Nombre: " + nombre +
                "\n Apellidos: " + apellido +
                "\n Edad: " + edad +
                "\n Correo Electronico: " + correo +
                "\n Username: " + Username +
                "\n Password: " + Password;
    }
}