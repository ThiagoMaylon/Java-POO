public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacoes;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo){
        this.setTitulo(titulo);
        this.setAvaliacoes(1);
        this.setViews(0);
        this.setReproduzindo(false);
    }

    @Override
    public void play(){
        if(this.isReproduzindo() == false){
            this.setReproduzindo(true);
        }
    }
    @Override
    public void pause(){
        if(this.isReproduzindo()){
            this.setReproduzindo(false);
        }
    }
    @Override    
    public void like(){
        this.setCurtidas(this.getCurtidas() + 1);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacoes() {
        return avaliacoes;
    }
    public void setAvaliacoes(int avaliacoes) {
        int nova;
        nova = (this.getAvaliacoes() + avaliacoes) / 2;
        this.avaliacoes = nova;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video [titulo=" + titulo + ", avaliacoes=" + avaliacoes + ", views=" + views + ", curtidas=" + curtidas
                + ", reproduzindo=" + reproduzindo + "]";
    }
    
}
