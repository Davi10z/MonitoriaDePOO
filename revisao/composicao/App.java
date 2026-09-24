package revisao.composicao;

public class App {
    public static void main(String[] args){
        Autor autor = new Autor("Pedro", "brasileiro");
        Livro livro = new Livro("Os três porquinhos", 29.90, autor);

        livro.exibirDetalhes();
    }
}
