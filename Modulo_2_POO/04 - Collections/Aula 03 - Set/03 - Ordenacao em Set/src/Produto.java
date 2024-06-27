import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    //atributos

    private long codigo;

    private String nome;

    private double preco;

    private int quantidade;

    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Produto produto)) return false;
        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    public int getQuantidade() {
        return quantidade;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String toString() {
        return String.format("Código: %d\nNome: %s\nPreço: %.2f\nQuantidade: %d\n", codigo, nome, preco, quantidade);
    }
}

class ComparatorPorPreco implements Comparator<Produto>{

    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
