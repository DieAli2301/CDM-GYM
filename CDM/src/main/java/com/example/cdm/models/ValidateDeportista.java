package com.example.cdm.models;

import java.util.ArrayList;

public class ValidateDeportista {


    public static String impresionDeportistas(){
        String totalimpresion1="";
        for(int i=0;i<BaseDatos.deportista.size();i++){
            totalimpresion1 += BaseDatos.deportista.get(i).toString();
        }
        return totalimpresion1;
    }


    public boolean autenticarUser(String username, String password){
        boolean status = false;
        Deportista user1 = findUser(username);
        if ( user1 != null && user1.getPassword().equals(password))
            status = true;
        return  status;

    }

    private  Deportista findUser(String username){
        Deportista user1 = null;
        boolean status = false;
        int index = 0;
        while (!status && index< BaseDatos.deportista.size()){
            if (BaseDatos.deportista.get(index).getUsername().equals(username)){
                user1 = BaseDatos.deportista.get(index);
                status = true;
            }
            index++;
        }
        return user1;
    }
}
