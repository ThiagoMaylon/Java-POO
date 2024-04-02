package com.example;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jose", 34, "M");
        Aluno p2 = new Aluno("Dan", 19, "F");
        Professor p4 = new Professor("Carlos", 54, "M");
        Funcionario p3 = new Funcionario("Clara", 53, "F");

        p1.fazerAniversario();
        p2.cancelarMatr();
        p4.recebeAum(18.0f);
        p3.mudaTrabalho();
    }
}