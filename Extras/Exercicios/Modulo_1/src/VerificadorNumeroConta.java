import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        
        String numeroConta = scanner.nextLine(); 
        

        try {
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
        }
                
    }

    private static void verificarNumeroConta(String numeroConta) { 

        if(numeroConta.length() != 8 ){
            throw new IllegalArgumentException("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        }

     
    }
}  
