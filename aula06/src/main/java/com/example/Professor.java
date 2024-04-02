package com.example;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public Professor(String n, int i, String s){
        super(n, i, s);
    }
    public void recebeAum(float valor){
        this.setSalario(this.getSalario() + valor);
    }
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
