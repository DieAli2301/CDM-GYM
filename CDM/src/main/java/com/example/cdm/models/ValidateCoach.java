package com.example.cdm.models;

import java.util.ArrayList;

public class ValidateCoach {


    public static String impresionCoach(){
        String totalimpresion="";
        for(int i=0;i<BaseDatos.coach.size();i++){
            totalimpresion += BaseDatos.coach.get(i).toString();
        }
        return totalimpresion;
    }


    public boolean autenticarCoach(String username, String password){
        boolean status1 = false;
        Coach coach1 = findCoach(username);
        if ( coach1 != null && coach1.getPassword().equals(password))
            status1 = true;
        return  status1;

    }

    private  Coach findCoach(String username){
        Coach coach1 = null;
        boolean status1 = false;
        int index = 0;
        while (!status1 && index<BaseDatos.coach.size()){
            if (BaseDatos.coach.get(index).getUsername().equals(username)){
                coach1 = BaseDatos.coach.get(index);
                status1 = true;
            }
            index++;
        }
        return coach1;
    }
}
