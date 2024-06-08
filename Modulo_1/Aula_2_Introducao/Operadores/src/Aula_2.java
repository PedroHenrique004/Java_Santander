public class Aula_2 {

    public static void main(String[] args) {
        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        // Apos a string ele não faz mais operacoes logicas

        System.out.println(concatenacao);

        concatenacao = "1" + (1+1+1);
        
        System.out.println(concatenacao);
    }
}
