package com.example.exercicio;

public class Geladeira {
    String cor;
    int porta;
    double litros;
    boolean aberta;

    void status(){
        System.out.println("Cor: "+ this.cor);
        System.out.println("Quantas portas: "+ this.porta);
        System.out.println("Quantos litros: "+ this.litros);
        System.out.println("Está aberta? "+ this.aberta);
    }

    void abrir(){
        this.aberta = true;
    }
    void fechar(){
        this.aberta = false;
    }

    void pegarAgua(){
        if(!this.aberta){
            System.out.println("ERRO: vc deve abrir a geladeira primeiro");
        }else{
            System.out.println("vc pegou a água");
            this.aberta = false;
        }
    }
}
