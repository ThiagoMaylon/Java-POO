package com.example;
public class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    // métodos especiais
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitoria(vi);
        this.setDerrota(de);
        this.setEmpate(em);
    }
    private void setNome(String n){
        this.nome = n;
    }
    private String getNome(){
        return this.nome;
    }
    private void setNacionalidade(String n){
        this.nacionalidade = n;
    }
    private String getNacionalidade(){
        return this.nacionalidade;
    }
    private void setIdade(int i){
        this.idade = i;
    }
    private int getIdade(){
        return this.idade;
    }
    private void setAltura(float a){
        this.altura = a;
    }
    private float getAltura(){
        return this.altura;
    }
    private void setPeso(float p){
        this.peso = p;
        this.setCategoria(this.getPeso());
    }
    private float getPeso(){
        return this.peso;
    }
    private void setCategoria(float p){
        if(p < 52.2){
            this.categoria = "Inválido";
        }else if(p <= 70.3){
            this.categoria = "Leve";
        }else if(p <= 83.9){
            this.categoria = "Médio";
        }else if(p <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }
    public String getCategoria(){

        return this.categoria;
    }
    private void setVitoria(int v){
        this.vitorias = v;
    }
    private int getVitoria(){
        return this.vitorias;
    }
    private void setDerrota(int d){
        this.derrotas = d;
    }
    private int getDerrota(){
        return this.derrotas;
    }
    private void setEmpate(int e){
        this.empates = e;
    }
    private int getEmpate(){
        return this.empates;
    }
    
    // métodos
    public void aprensentar(){
        System.out.println("CHEGOU A HORA ! Apresentarmos o lutador "+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("com "+this.getIdade() +" Anos e "+ this.getAltura() +"m de Altura");
        System.out.println("Pesando "+this.getPeso()+"kg");
        System.out.println(this.getVitoria()+" Vitórias");
        System.out.println(this.getDerrota()+" Derrotas");
        System.out.println(this.getEmpate()+" Empates");
    }
    public void status(){
        System.out.println(this.getNome());
        System.out.println("É um peso "+this.getCategoria());
        System.out.println("Ganhou: "+this.getVitoria());
        System.out.println("Perdeu: "+this.getDerrota());
        System.out.println("Empatou: "+this.getEmpate());
    }
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    public void perderLuta(){
        this.setDerrota(this.getDerrota() + 1);
    }
    public void empatar(){
        this.setEmpate(this.getEmpate() + 1);
    }

}
