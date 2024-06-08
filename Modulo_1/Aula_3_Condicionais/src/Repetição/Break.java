package Repetição;

public class Break {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){

            // O BREAK interrompe o For mesmo que o for não tenha acabado
            if ((numero == 3)) {
                break;
                // continue; // isso continuaria o codigo
            }

            System.out.println(numero);
        }
    }
}
