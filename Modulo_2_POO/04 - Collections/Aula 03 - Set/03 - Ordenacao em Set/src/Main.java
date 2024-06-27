import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Criação da instância de CadastroProdutos
        CadastroProdutos cadastro = new CadastroProdutos();

        // Adicionando produtos
        cadastro.adicionarProduto(1, "Arroz", 5.50, 10);
        cadastro.adicionarProduto(2, "Feijão", 7.30, 20);
        cadastro.adicionarProduto(3, "Macarrão", 3.20, 15);

        // Exibindo produtos ordenados por nome
        System.out.println("Produtos ordenados por nome:");
        Set<Produto> produtosPorNome = cadastro.exibirProdutosPorNome();
        for (Produto produto : produtosPorNome) {
            System.out.println(produto);
        }

        // Exibindo produtos ordenados por preço
        System.out.println("\nProdutos ordenados por preço:");
        Set<Produto> produtosPorPreco = cadastro.exibirProdutosPorPreco();
        for (Produto produto : produtosPorPreco) {
            System.out.println(produto);
        }
    }
}
