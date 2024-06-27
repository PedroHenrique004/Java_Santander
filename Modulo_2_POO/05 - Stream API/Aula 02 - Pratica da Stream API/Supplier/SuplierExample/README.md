Olhar o codigo da ConsumerExample.java

--------------- Explicação --------------------

List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    Comentário: 

    Explica que uma lista de números inteiros será criada.

    -> cria uma lista imutável de números inteiros usando o método Arrays.asList.
    Criação da Lista: List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5); 

------------------------------------------------------

 // Usar o Consumer para imprimir números pares no Stream

    numeros.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);

Comentário: Indica que o Consumer será usado para imprimir números pares em um Stream.

Criação do Stream: numeros.stream() cria um Stream a partir da lista numeros.

Filtragem dos Números Pares: .filter(n -> n % 2 == 0) usa uma expressão lambda para filtrar apenas os números pares do Stream.

Impressão dos Números Pares: .forEach(System.out::println); usa o método de referência System.out::println para imprimir cada número par do Stream.


----------------------------------------------

// Usar o Consumer com expressão lambda para imprimir números pares
    Consumer<Integer> imprimirNumeroPar = numero -> {
      if (numero % 2 == 0) {
        System.out.println(numero);
      }
    };
Comentário: 

Indica que um Consumer será usado com uma expressão lambda para imprimir números pares.

Definição do Consumer: Consumer<Integer> imprimirNumeroPar = numero -> { ... }; define um Consumer que aceita um número inteiro.

numero -> { ... } é a expressão lambda que representa o método accept do Consumer.

Verificação de Número Par: if (numero % 2 == 0) verifica se o número é par.

Impressão do Número Par: System.out.println(numero); imprime o número par.



    