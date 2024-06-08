import java.util.Scanner;

public class ContaTerminal {

    
    String nomeCliente = "";
    double saldo = 0.00;
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o número da conta: ");
        Integer numeroConta = scanner.nextInt();
        scanner.nextLine();  // Adicionado para consumir o '\n' que sobrou (Descobri que precisa se não a agencia vira string vazia)

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + "! obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
         ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
