import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 

        while (true) { 

            int opcao = scanner.nextInt(); 
            switch(opcao) {

                  case 1:
                    int valor = scanner.nextInt(); 
                    saldo += valor; 
                    System.out.println("Saldo atual: " + saldo);
                    break;

                  case 2:
                    valor = scanner.nextInt(); 
                    if (valor > saldo){
                      System.out.println("Saldo insuficiente.");
                    
                    }
                    else{
                      saldo -= valor; 
                      System.out.println("Saldo atual: " + saldo);
                    }    
                    break;    
                  
                  case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                  case 0:;
                    System.out.println("Programa encerrado.");
                    return;

                  default:
                    System.out.println("Opção inválida. Tente novamente."); 
                }
            
                
            }
        }
    }

