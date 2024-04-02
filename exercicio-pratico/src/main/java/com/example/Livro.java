package com.example;

public class Livro implements Publicação{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String t, String a, int tt, Pessoa l){
        this.setTitulo(t);
        this.setAutor(a);
        this.setTotPaginas(tt);
        this.setPagAtual(1);
        this.setAberto(false);
        this.setLeitor(l);
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }public Pessoa getLeitor() {
        return leitor;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public boolean getAberto(){
        return this.aberto;
    }

    public void detalhes(){
        System.out.println("###################################");
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Total de paginas: "+this.getTotPaginas());
        System.out.println("Pagina Atual: "+this.getPagAtual());
        System.out.println("Leitor: "+this.getLeitor().getNome());
        System.out.println("###################################");
    }


    @Override
    public void abrir() {
        this.setAberto(true);
    }


    @Override
    public void fechar() {
        this.setAberto(false);
    }


    @Override
    public void folhear(int pag) {
        if(this.getAberto()){
            if(pag < this.getTotPaginas() && pag > 0){
                this.setPagAtual(pag);
            }
        }
    }


    @Override
    public void avançarPag() {
        if(this.getAberto()){
            if(this.getPagAtual() + 1 > this.getTotPaginas()){
                System.out.println("vc já leu todo o livro");
            }else{
                this.setPagAtual(this.getPagAtual() + 1);
            }
        }else{
            System.out.println("o livro está fechado");
        }
    }
    
    
    @Override
    public void voltarPag() {
        if(this.getAberto()){
            if(this.getPagAtual() == 1){
                System.out.println("vc ainda está na primeira pagina");
            }else{
                this.setPagAtual(this.getPagAtual() - 1);
            }
        }else{
            System.out.println("o livro está fechado");
        }
    }
}
