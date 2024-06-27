import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
  public static void main(String[] args) {
    // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
    Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

    // Usar o Supplier para obter uma lista com 5 saudações
    // Generate/Limit/ToList é um metodo da Stream
    List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(5)
        .toList();
    // Esse aqui em cima cria uma lista que tem tamanho 5 e preenche ela com a saudacao

    // Imprimir as saudações geradas
    listaSaudacoes.forEach(System.out::println);
  }
}