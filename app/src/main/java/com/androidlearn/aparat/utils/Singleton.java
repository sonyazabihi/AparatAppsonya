package com.androidlearn.aparat.utils;

public class Singleton {

    public  static Singleton istance = null;

    private Singleton(){

    }

    public static Singleton getIstance() {
        if(istance== null){
            istance= new Singleton();
        }
        return istance;
    }
}
