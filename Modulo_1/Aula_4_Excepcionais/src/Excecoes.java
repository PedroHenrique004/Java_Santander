import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
 *  Try -> Bloco de codigo para ser testado quando ha erros enquanto é executado
 * 
 *      try {
 *          codigo
 *       }
 * 
 *  Catch -> Bloco de codigo caso de erro no try
 * 
 *      catch (Exception e) {
 *          codigo
 *       }
 * 
 *  Finally -> Bloco de codigo executado independente de ter um erro ou não
 */

public class Excecoes {

    // Erros -> São erros que travam e param o programa
    //Exeções -> Fluxos inesperados, onde podemos tratar essas exeções e tentar corrigir


    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
            System.out.println("Digite seu nome :");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome :");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade :");
            int idade = scanner.nextInt();

            System.out.println("Digite seu altura :");
            double altura = scanner.nextDouble();

            System.out.println("ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println(" Tenho " + idade + " anos");
            System.out.println("Minha altura é de : " + altura + " centimetros");
            scanner.close();
        }
        catch (InputMismatchException e){
            System.err.println("Os campos de idade e altura precisam ser númericos");
        }

        
    }
}
