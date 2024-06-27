public class Main {
    public static void main(String[] args) {

        ListaTarefa nomeLista = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + nomeLista.obterNumeroTotalDeTarefas());

        nomeLista.adicionarTarefa("1 Tarefa");
        nomeLista.adicionarTarefa("2 Tarefa");
        nomeLista.adicionarTarefa("3 Tarefa");

        System.out.println("O número total de elementos na lista é: " + nomeLista.obterNumeroTotalDeTarefas());

        nomeLista.removerTarefa("3 Tarefa");
        System.out.println("O número total de elementos na lista é: " + nomeLista.obterNumeroTotalDeTarefas());

        nomeLista.obterDescricoesTarefas();
    }
}
