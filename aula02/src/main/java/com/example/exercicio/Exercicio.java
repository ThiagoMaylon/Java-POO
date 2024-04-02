package com.example.exercicio;

public class Exercicio {
    public static void main(String[] args){
        Geladeira g1 = new Geladeira();
        g1.cor = "Branca";
        g1.porta = 2;
        g1.litros = 340.0;
        g1.fechar();
        g1.status();
        g1.pegarAgua();
        g1.abrir();
        g1.status();
        g1.pegarAgua();
        g1.status();
    }
}
