public class Main {
    public static void main(String[] args) {

        CatalogoLivros biblioteca = new CatalogoLivros();

        biblioteca.adicionarLivro("Livro 1", "Autor 1", 2020);
        biblioteca.adicionarLivro("Livro 1", "Autor 2", 2021);
        biblioteca.adicionarLivro("Livro 2", "Autor 2", 2022);
        biblioteca.adicionarLivro("Livro 3", "Autor 3", 2023);
        biblioteca.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(biblioteca.pesquisarPorAutor("Autor 2"));
        System.out.println(biblioteca.pesquisarPorintervaloDeAno(2020, 2022));
        System.out.println(biblioteca.pesquisarPorTitulo("Livro 1"));

    }
}
