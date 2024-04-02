public class App {
    public static void main(String[] args) throws Exception {
        Cachorro c1 = new Cachorro();
        c1.setCorPelo("Branco");
        c1.setIdade(1);
        c1.alimentar();
        c1.locomover();
    }
}
