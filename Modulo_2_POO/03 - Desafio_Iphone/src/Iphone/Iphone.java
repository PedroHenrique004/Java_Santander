package Iphone;

import Ligacoes.AparelhoTelefonico;
import Musicas.ReprodutorMusical;
import Navegadores.NavegadorInternet;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

    public void ligar(String telefone) {
       System.out.println("Ligando para o número " + telefone + " pelo Iphone");
    }

    public void atender() {
        System.out.println("Ligaçao atendidada pelo Iphone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo Iphone");
    }

    public void tocarMusica(){
        System.out.println("Tocando música pelo Iphone");
    }

    public void pausar(){
        System.out.println("Musica pausada");
    }

    public void trocarMusica(String nomeMusica){
        System.out.println("Tocando a música " + nomeMusica + " no Iphone");
    }

    
    public void exibirPagina(String link) {
        System.out.println("Acessando o link " + link + " pelo iphone");
    }

    
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    
    public void atualizarPagina() {
        System.out.println("Página atualizada com sucesso no Iphone");
    }
    
      
}
