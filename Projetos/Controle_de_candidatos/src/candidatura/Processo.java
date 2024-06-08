package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Processo {
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
        imprimirSelecionados();

        for(String candidato : listaAprovado){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 0;
        boolean atendeu = false;
    
        while (!atendeu && tentativasRealizadas < 3) {
            atendeu = atender();
            tentativasRealizadas++;
        }
    
        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na tentativa " + tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", número de tentativas: " + tentativasRealizadas);
        }
    }
    

    static String [] listaAprovado = new String[5];

    static void imprimirSelecionados(){
        System.out.println("Lista de aprovados:");

        for(int indice = 0; indice < listaAprovado.length; indice++){
            if(listaAprovado[indice] != null){
                System.out.println("Candidato " + (indice + 1) + ": " + listaAprovado[indice]);
            }
        }
    }

    static void selecaoCandidatos(){
        String []  candidatos = {"PEDRO","ANA","GABRIEL","WEDER","MERCIA","OSWALDO","NAZILDA","ADONAI","DORCAS"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            double salarioBase = 2000.0;

            System.out.println("O candidato " + candidato + " solicitou este salário: " + salarioPretendido);

            if (salarioBase > salarioPretendido){
                System.out.println("LIGAR PARA O CANDIDATO");
                listaAprovado[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
}


    // static void analisarCandidato(double salarioPretendido) {
    //     double salarioBase = 2000.0;

    //     if (salarioBase > salarioPretendido){
    //         System.out.println("LIGAR PARA O CANDIDATO");
    //     }
    //     else if(salarioBase == salarioPretendido)
    //         System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
    //     else {
    //         System.out.println("Aguardando resultado dos demais candidatos");
    //     }
    // }
