import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criação da instância de AgendaEventos
        AgendaEventos agenda = new AgendaEventos();

        // Adicionando eventos à agenda
        agenda.adicionarEvento(LocalDate.of(2024, 6, 10), "Festival de Música", "Bandas Locais");
        agenda.adicionarEvento(LocalDate.of(2024, 6, 15), "Exposição de Arte", "Artistas Regionais");
        agenda.adicionarEvento(LocalDate.of(2024, 6, 20), "Feira de Tecnologia", "Inovações Tecnológicas");
        agenda.adicionarEvento(LocalDate.of(2024, 6, 25), "Encontro de Literatura", "Escritores Famosos");

        // Exibindo toda a agenda de eventos
        System.out.println("Agenda de Eventos:");
        agenda.exibirAgenda();

        // Obtendo o próximo evento a partir da data atual
        System.out.println("\nPróximo Evento:");
        agenda.obterProximoEvento();
    }
}
