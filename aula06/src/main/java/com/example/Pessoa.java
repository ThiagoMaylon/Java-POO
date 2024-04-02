package com.example;

public class Pessoa{
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String n, int i, String s){
        this.setIdade(i);
        this.setNome(n);
        this.setSexo(s);
    }

    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}