public class App {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("jose");
        v1.setIade(23);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Eduardo");
        a1.setIade(13);
        a1.setSexo("M");
        a1.setCurso("Geografia");
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setNome("Junior");
        b1.setIade(14);
        b1.setSexo("M");
        b1.setCurso("Informática");
        b1.setBolsa(13);
        b1.pagarMensalidade();
        System.out.println(b1.toString());
    }
}
