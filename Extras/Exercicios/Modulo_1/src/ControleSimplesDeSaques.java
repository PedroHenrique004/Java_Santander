import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        double saque = scanner.nextDouble();
        controleSaques(limiteDiario, saque);

        scanner.close(); 
    }

    private static void controleSaques(double limite, double saque){
        if (saque <= 0) {
            System.out.println("Transacoes encerradas.");
            return;
        }
        else if (saque > limite){
            System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            return;
        }
        else{
            limite -= saque;
            System.out.println("Saque realizado. Limite restante: " + limite);
            System.out.println("Transacoes encerradas.");
        }

    }
}

        

