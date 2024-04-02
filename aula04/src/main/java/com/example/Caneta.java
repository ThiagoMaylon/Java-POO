package com.example;

public class Caneta {
    private String modelo;
    private float ponta;
    public boolean tampada;
    public String cor;

    public Caneta(String cModelo, String cCor, float cPonta){
        this.cor = cCor;
        this.setModelo(cModelo);
        this.setPonta(cPonta);
        this.tampar();
    }

    public void tampar(){
        if(!this.tampada){
            this.tampada = true;
        }
    }
    public void destampar(){
        if(this.tampada){
            this.tampada = false;
        }
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    } 
}
