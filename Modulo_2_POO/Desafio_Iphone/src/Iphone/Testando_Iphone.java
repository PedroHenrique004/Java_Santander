package Iphone;

public class Testando_Iphone {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone();

        System.out.println("Testando os metodos de ligaçao: \n");

        iphone1.ligar("123456");
        iphone1.atender();
        iphone1.iniciarCorreioVoz();
        System.out.println("\n");

        System.out.println("Testando os metodos musicais: \n");

        iphone1.tocarMusica();
        iphone1.pausar();
        iphone1.trocarMusica("I wonder - kanye West");
        System.out.println("\n");

        System.out.println("Testando os metodos de internet: \n");

        iphone1.exibirPagina("stackoverflow.com");
        iphone1.adicionarNovaAba();
        iphone1.atualizarPagina();

    } 
}
