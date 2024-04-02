public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssistido(0);
    }

    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    @Override
    public void ganharExp(){
        this.setExperiencia(this.getExperiencia() + 1);
    }

    public String isLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto ["+super.toString()+"\nlogin=" + login + ", totAssistido=" + totAssistido + "]";
    }
    
    
}
