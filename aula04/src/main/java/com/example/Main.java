package com.example;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic Cristal", "Azul", 0.5f);

        System.out.println(c1.getModelo());
        System.out.println(c1.getPonta());
        System.out.println(c1.tampada);
    }
}