import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Criação da instância de AgendaContatos
        AgendaContatos agenda = new AgendaContatos();

        // Adicionando contatos
        agenda.adicionarContato("Alice", 12345);
        agenda.adicionarContato("Bob", 67890);
        agenda.adicionarContato("Bob Marley", 67890123);
        agenda.adicionarContato("Carol", 54321);

        // Tentando adicionar um contato com nome duplicado
        agenda.adicionarContato("Alice", 11111);  // Deve falhar

        // Exibindo todos os contatos
        agenda.exibirContatos();

        // Pesquisando contatos pelo nome
        Set<Contato> contatosEncontrados = agenda.pesquisarPorNome("Bo");
        System.out.println("Contatos encontrados com o nome 'Bo': " + contatosEncontrados);

        // Atualizando o número de um contato
        Contato atualizado = agenda.atualizarNumeroContato("Bob", 98765);
        System.out.println("Contato atualizado: " + atualizado);

        // Exibindo todos os contatos após a atualização
        agenda.exibirContatos();
    }
}
