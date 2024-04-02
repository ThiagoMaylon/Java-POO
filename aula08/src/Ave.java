public class Ave extends Animal{
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void alimentar() {
        System.out.println("comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Ave");
    }

    @Override
    public void locomover() {
        System.out.println("voando");
    }
    
    public void fazerNinho(){
        System.out.println("fazando ninho");
    }
}
