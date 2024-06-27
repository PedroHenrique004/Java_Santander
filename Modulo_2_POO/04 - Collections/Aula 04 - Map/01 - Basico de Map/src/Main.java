public class Main {
    public static void main(String[] args) {
        // Criação da instância de AgendaContatos
        AgendaContatos agenda = new AgendaContatos();

        // Adicionando contatos
        agenda.adicionarContato("Alice", 12345);
        agenda.adicionarContato("Bob", 67890);
        agenda.adicionarContato("Carol", 54321);

        // Exibindo todos os contatos
        System.out.println("Contatos na agenda:");
        agenda.exibirContatos();

        // Pesquisando contato pelo nome
        String nomeParaPesquisar = "Bob";
        Integer numero = agenda.pesquisarPorNome(nomeParaPesquisar);
        
        if (numero != null) {
            System.out.println("Número de " + nomeParaPesquisar + ": " + numero);
        } else {
            System.out.println(nomeParaPesquisar + " não encontrado na agenda.");
        }

        // Removendo um contato
        String nomeParaRemover = "Alice";
        agenda.removerContato(nomeParaRemover);
        System.out.println("Contatos na agenda após remover " + nomeParaRemover + ":");
        agenda.exibirContatos();

        // Tentando pesquisar um contato removido
        numero = agenda.pesquisarPorNome(nomeParaRemover);
        if (numero != null) {
            System.out.println("Número de " + nomeParaRemover + ": " + numero);
        } else {
            System.out.println(nomeParaRemover + " não encontrado na agenda.");
        }
    }
}

