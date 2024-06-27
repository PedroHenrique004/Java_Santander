import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criação da instância de OrdenacaoPessoa
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        // Adicionando pessoas à lista
        ordenacaoPessoa.adicionarPessoa("Alice", 30, 1.65);
        ordenacaoPessoa.adicionarPessoa("Bob", 25, 1.75);
        ordenacaoPessoa.adicionarPessoa("Carol", 28, 1.70);
        ordenacaoPessoa.adicionarPessoa("Dave", 22, 1.80);

        // Ordenando por idade
        List<Pessoa> pessoasPorIdade = ordenacaoPessoa.ordenaPorIdade();

        // Exibo essa ordenação
        System.out.println("Pessoas ordenadas por idade:");
        for (Pessoa p : pessoasPorIdade) {
            System.out.println(p);
        }

        // Ordenando por altura
        List<Pessoa> pessoasPorAltura = ordenacaoPessoa.ordenarporAltura();

        // Exibo essa ordenação
        System.out.println("\nPessoas ordenadas por altura:");
        for (Pessoa p : pessoasPorAltura) {
            System.out.println(p);
        }
    }
}

