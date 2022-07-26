package com.example.cdm.models;

public class Deportista extends Usuarios {

    float peso;
    int estatura;
    String Username;
    String Password;


    public Deportista(String nombre, String apellido, int edad, String correo, float peso,  int estatura, String username, String password) {
        super(nombre, apellido, edad, correo);
        this.peso = peso;
        this.estatura = estatura;
        Username = username;
        Password = password;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura( int estatura) {
        this.estatura = estatura;
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
        return "\n Deportista" +
                "\n Nombre: " + nombre +
                "\n Apellidos: " + apellido +
                "\n Edad: " + edad +
                "\n Estatura: " + estatura +
                "\n Peso: " + peso +
                "\n Correo Electronico: " + correo +
                "\n Username: " + Username +
                "\n Password: " + Password;
    }
}
