package com.loyalty.proyectoTDD.utils;

public class ValidaMun {


    public static boolean validaMun(String ftnum){
        if(ftnum.length()==11){
            return true;
        }
        return false;
    }
}
