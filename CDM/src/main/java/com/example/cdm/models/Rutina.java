package com.example.cdm.models;

public class Rutina {

    String tiporutina;

    public Rutina() {
    }

    public Rutina(String tiporutina) {
        this.tiporutina = tiporutina;
    }

    public String getTiporutina() {
        return tiporutina;
    }

    public void setTiporutina(String tiporutina) {
        this.tiporutina = tiporutina;
    }

    @Override
    public String toString() {
        return "\nMi rutina: " + tiporutina+"\n\n";
    }
}
