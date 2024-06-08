package Repetição;

import java.util.concurrent.ThreadLocalRandom;

public class While {

    // retorna um double entre 2 e 8

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,15);
    };
    
    public static void main(String[] args) {
        double mesada = 50.0;


        while (mesada > 0){
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada){
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada : " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");
    }
};


