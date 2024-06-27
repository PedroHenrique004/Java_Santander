import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    

    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome,double preco , int quantidade){
        estoqueProdutoMap.put(cod, new Produto(nome, preco,  quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutoMap);
    }

    public double calculavalorTotalEstoqur(){

        double valorTotalEstoque = 0;

        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;

        for(Produto p: estoqueProdutoMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;

        double menorPreco = Double.MAX_VALUE;

        for(Produto p: estoqueProdutoMap.values()){
            if(p.getPreco() < menorPreco){
                produtoMaisBarato = p;
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
          for (Map.Entry<Long, Produto> entry : estoqueProdutoMap.entrySet()) {
            double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
            if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
              maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
              produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
            }
          }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
      }

    

}
