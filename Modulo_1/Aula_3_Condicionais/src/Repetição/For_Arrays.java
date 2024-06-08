package Repetição;

public class For_Arrays {
    public static void main(String[] args) {

        // Array = conjunto de elementos de um tipo correspondente

        String alunos[] = {"PEDRO", "ANA", "GABRIEL"};

        // Percorre por posição

        for (int x = 0; x < alunos.length; x++){ // .length é o tamanho do array
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }

        // For each , um pouquinho mais otimizado


        // String aluno -> Passa um tipo
        for (String aluno : alunos){
            System.out.println("O nome do aluno é " + aluno);
        }

    }
}   
