package com.example;

public class Aluno extends Pessoa{
    private int mat;
    private String curso;

    public Aluno(String n, int i,String s){
        super(n, i, s);
    }
    public void cancelarMatr(){
        System.out.println("Matéria cancelada!");
    }
    public int getMat() {
        return mat;
    }
    public void setMat(int mat) {
        this.mat = mat;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
