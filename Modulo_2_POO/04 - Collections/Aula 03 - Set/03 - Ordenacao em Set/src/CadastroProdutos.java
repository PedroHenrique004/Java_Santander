import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    
    //atributos

    private Set<Produto> produtoSet;

    public CadastroProdutos() { 
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double valor, int quantidade){
        produtoSet.add(new Produto(codigo, nome, valor,quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtoPorPreco;
    }
}
