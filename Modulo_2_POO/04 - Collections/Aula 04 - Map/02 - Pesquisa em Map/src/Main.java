public class Main {
    public static void main(String[] args) {
        // Criação da instância de EstoqueProdutos
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Adicionando produtos ao estoque
        estoque.adicionarProduto(1L, "Arroz", 20.0, 50);
        estoque.adicionarProduto(2L, "Feijão", 10.0, 100);
        estoque.adicionarProduto(3L, "Macarrão", 5.0, 200);
        estoque.adicionarProduto(4L, "Óleo", 8.0, 75);

        // Exibindo todos os produtos no estoque
        System.out.println("Produtos no estoque:");
        estoque.exibirProdutos();

        // Calculando o valor total do estoque
        double valorTotalEstoque = estoque.calculavalorTotalEstoqur();
        System.out.println("Valor total do estoque: " + valorTotalEstoque);

        // Obtendo o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtendo o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtendo o produto com maior quantidade de valor total no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade de valor total no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}

