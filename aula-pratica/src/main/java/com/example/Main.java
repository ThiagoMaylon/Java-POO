package com.example;

public class Main {
    public static void main(String[] args) {
        ContaBanco jubileu = new ContaBanco();
        jubileu.abrirConta("CC");
        jubileu.setDono("Jubileu");
        jubileu.setNumconta(111);
        jubileu.depositar(300);

        ContaBanco cleusa = new ContaBanco();
        cleusa.abrirConta("CP");
        cleusa.setDono("Cleusa");
        cleusa.setNumconta(222);
        cleusa.depositar(500);
        cleusa.estadoatual();
        
        jubileu.estadoatual();
        jubileu.fecharConta();
        jubileu.sacar(350);
        jubileu.fecharConta();
        jubileu.estadoatual();
    }
}