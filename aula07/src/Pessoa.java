public abstract class Pessoa{
    private String nome;
    private int iade;
    private String sexo;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIade() {
        return iade;
    }
    public void setIade(int iade) {
        this.iade = iade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public final void fazerAniv(){
        this.setIade(this.getIade() + 1);
    }
    
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", iade=" + iade + ", sexo=" + sexo + "]";
    }
    
}