package com.example;

import java.util.Random;

public class Luta {
    private Lutador desafiante, desafiado;
    private int rounds;
    private boolean aprovada;
    
    public void setDesafiante(Lutador df){
        this.desafiante = df;
    }
    public Lutador getDesafiante(){
        return this.desafiante;
    }

    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }
    public Lutador getDesafiado(){
        return this.desafiado;
    }
    public void setRounds(int r){
        this.rounds = r;
    }
    public int getRounds(){
        return this.rounds;
    }
    public void setAprovada(boolean a){
        this.aprovada = a;
    }
    public boolean getAprovada(){
        return this.aprovada;
    }


    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    };
    public void lutar(){
        if(this.getAprovada()){
            System.out.println("#### DESAFIADO ####");
            this.getDesafiado().aprensentar(); 
            System.out.println("#### DESAFIANTE ####");
            this.getDesafiante().aprensentar();

            Random random = new Random();
            int vencedor = random.nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    this.getDesafiado().empatar();
                    this.getDesafiante().empatar();
                    break;
                case 1:
                    System.out.println("Desafiante Ganhou");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
                case 2:
                    System.out.println("Desafiado Ganhou");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
            }
        }else{
            System.out.println("Essa luta não pode acontecer!!");
        }
    };
}
