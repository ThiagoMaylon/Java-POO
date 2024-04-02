package com.example;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public Funcionario(String n, int i, String s) {
        super(n, i, s);
        
    }

    public void mudaTrabalho(){
        this.setTrabalhando(!this.getTrabalhando());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
