package Condicional;
public class If_else {


    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 15.0;

        // Também posso usar o ternário:

        String novoSaldo = saldo > valorSolicitado ? "Valor retirado" : "Seu saldo nao permite esse saque";
        System.out.println(novoSaldo);

        // Só esse if é uma condicional simples

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        }
        
        // A partir daqui é uma composta
         // Condição encadeada -> Else if
        else if(valorSolicitado  > saldo)
            System.out.println("O valor solicitado é maior que o saldo disponível");
  
        else
            System.out.println("Sua conta está zerada!");

        // Tambem tem o switch case que é tranquilo
        
    }
}
