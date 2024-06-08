package Repetição;

import java.util.Random;

public class Do_While {
    
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando...");
        }
        while(tocando());
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;

        System.out.println("Atendeu? " + atendeu);

        return ! atendeu; // negando o ato de continuar tocando
    }
}
