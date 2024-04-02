public class Peixe extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void alimentar() {
        System.out.println("comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("não faz som");
    }

    @Override
    public void locomover() {
        System.out.println("nadando");
    }
    
    public void soltarBolha(){
        System.out.println("soultou uma bolha");
    }
}
