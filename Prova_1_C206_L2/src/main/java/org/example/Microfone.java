package org.example;

import java.util.Locale;

public class Microfone {
    //Atributos
    String material;

    //Contrutor
    public Microfone(String material){
        //material recebe uma string em letras minúsculas
        this.material = material.toLowerCase();
    }
}
