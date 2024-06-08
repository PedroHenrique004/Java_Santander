
public class Aula_6 {
    public static void main(String[] args) {
        // Para string é .equals():

        String nome1 = "Pedro";
        String nome2 = "Santos";

        System.out.println(nome1.equals(nome2)); // false
        System.out.println(!nome1.equals(nome2)); // true


        // O igual "==" é para numeros

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois?? " + simNao);

         simNao = numero1 <= numero2;

        System.out.println("numeroUm é menor a numeroDois?? " + simNao);
    }
}
