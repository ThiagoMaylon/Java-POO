package com.example;

public class Main {
    public static void main(String[] args) {
        var c1 = new Caneta();

        c1.cor = "Azul";
        c1.modelo = "Cristal";
        // c1.ponta = 0.5f;
        c1.carga = 60;
        c1.destampar();

        c1.status();
        
    }
}