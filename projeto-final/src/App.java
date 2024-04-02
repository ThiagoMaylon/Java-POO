public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];
        v[0] = new Video("aula 01 de Poo em java");
        v[1] = new Video("aula 12 de java");
        v[2] = new Video("aula 01 de Spring boot");


        System.out.println(v[0].toString());
        v[0].play();
        System.out.println(v[0].toString());

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba123");
        g[1] = new Gafanhoto("Creuza", 12, "F", "Creuzita");
        System.out.println(g[0].toString());

        Visualizacao vis1 = new Visualizacao(g[0], v[2]);
        v[2].play();
        vis1.avaliar(35.0f);
        System.out.println(vis1.toString());
        
        Visualizacao vis2 = new Visualizacao(g[1], v[0]);
        v[2].play();
        vis2.avaliar();
        System.out.println(vis2.toString());
    }
}
