package com.example;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String no, int id, String se){
        this.setNome(no);
        this.setIdade(id);
        this.setIdade(id);
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }
}
