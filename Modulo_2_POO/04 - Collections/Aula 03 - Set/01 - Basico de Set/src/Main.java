public class Main {
    public static void main(String[] args) {
        // Criação da instância de ConjuntoConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // Adicionando convidados
        conjuntoConvidados.adicionarConvidado("Alice", 101);
        conjuntoConvidados.adicionarConvidado("Bob", 102);
        conjuntoConvidados.adicionarConvidado("Carol", 103);

        // Contando o número de convidados
        System.out.println("Número de convidados: " + conjuntoConvidados.contarConvidados());

        // Removendo um convidado
        conjuntoConvidados.removerConvidadoPorConvite(102);

        // Contando o número de convidados novamente
        System.out.println("Número de convidados após remoçao: " + conjuntoConvidados.contarConvidados());
    }
}
