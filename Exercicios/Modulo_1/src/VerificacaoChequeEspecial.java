import java.util.Scanner;

public class VerificacaoChequeEspecial { 
    static double limiteChequeEspecial = 500; 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        double saldo = scanner.nextDouble(); 
        double saque = scanner.nextDouble(); 
        
        verificaLimite(saldo, saque);
        

        scanner.close(); 
        }      
    
    private static void verificaLimite(double saldo ,double valor){
      if (saldo > valor){
        System.out.println("Transacao realizada com sucesso.");   
      }
      else if ((saldo + limiteChequeEspecial) >= valor){
        System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
      }
      else {
        System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
      }
    }
}
