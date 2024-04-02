package com.example;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    ControleRemoto(){
        this.setVolume(0);
        this.setLigado(false);
        this.setTocando(false);
    }

    private void setVolume(int v){
        this.volume = v;
    }
    private int getVolume(){
        return this.volume;
    }

    private void setLigado(boolean l){
        this.ligado = l;
    }
    private boolean getLigado(){
        return this.ligado;
    }

    private void setTocando(boolean t){
        this.tocando = t;
    }
    private boolean getTocando(){
        return this.tocando;
    }

    @Override
    public void ligar(){
        this.setLigado(true);
    }

    @Override
    public void desligar(){
        this.setLigado(false);
    }

    @Override
    public void abrirMenu(){
        if(this.getLigado()){
            System.out.println("Está ligado? "+this.getLigado());
            System.out.println("Está tocando? "+this.getTocando());
    
            System.out.print("Volume: ");
            for(int i = 0; i < this.getVolume(); i++){
                System.out.print("|");
            }
            System.out.println(" "+this.getVolume()+"%");
        }
    }
    public void fecharMenu(){
        System.out.println("Fechando menu");
    }

    public void maisVolume(){
        if(this.getLigado() && this.getVolume() < 100){
            this.setVolume(this.getVolume() + 5);
        }
    }
    public void menosVolume(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(this.getVolume() - 5);
        }
    }
    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    public void play(){
        if(this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        }
    }
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
