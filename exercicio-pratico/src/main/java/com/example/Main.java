package com.example;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Henrrique", 45, "M");
        Livro l1 = new Livro("Aprenda Java", "José da Silva", 345, p1);

        l1.detalhes();
        l1.abrir();
        l1.folhear(15);
        l1.detalhes();
    }
}