public class App {
    public static void main(String[] args) throws Exception {
        Cachorro c1 = new Cachorro();
        c1.setPeso(4.5f);
        c1.emitirSom();
        c1.reagir("olá");
        c1.reagir("vai apanhar");
        c1.reagir(11, 45);
        c1.reagir(true);
        c1.reagir(false);
        c1.reagir(2, 12.5f);
        c1.reagir(17, c1.getPeso());
    }
}
