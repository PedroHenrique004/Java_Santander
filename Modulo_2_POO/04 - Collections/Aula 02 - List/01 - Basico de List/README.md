1. Lista de Tarefas

Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. Implemente os seguintes métodos:

adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.

--------------- Passo a passo --------------

1: Criei uma classe tarefa que recebe um atributo descricao: Olhar arquivo tarefa.java

2: Criei outra classe chamada ListaTarefa que tem atributo tipo List que é do tipo <Tarefa> chamado tarefaList:

        private List<Tarefa> tarefaList;

3: Crio um contrutor para essa lista: 

        public ListaTarefa(){
            this.tarefaList = new ArrayList<>();
        }

        // Sempre que eu criar um objeto do tipo ListaTarefa, automaticamente eu vou ter uma atributo (tarefaList) com uma arraylist vazia esperando

4: Crio os metodos de adicionar, remover tarefas a lista: 

        public void adicionarTarefa(String descricao){
            tarefaList.add(new Tarefa(descricao));
        }

        // ele usa o objeto criado la na Tarefa.java

        public void removerTarefa(String descricao){


// Nova lista que tera as listas com aquela descricao passada(pode ter +1)

            List<Tarefa> tarefasParaRemover = new ArrayList<>();


// Aqui é um forEach onde vejo se aquela tarefa está no array tarefaList, se estiver, add ela a lista tarefasParaRemover
            for(Tarefa t: tarefaList) { 
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(t);
                }

                tarefaList.removerAll(tarefasParaRemover);
            }
        }

5: Crio as funções de exibir o total de tarefas e as descrições:

    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

6: Crio na classe Tarefa um metodo toString que me devolve a descricao sem lixo de memoria

7: Crio uma classe main que testa os metodos que criei

-------------- EqualsIgnoreCase ------------------

Explicação do Método equalsIgnoreCase
O método equalsIgnoreCase é um método da classe String em Java. Ele é usado para comparar duas strings, ignorando diferenças entre maiúsculas e minúsculas. Em outras palavras, ele verifica se duas strings são equivalentes sem levar em consideração se os caracteres são maiúsculos ou minúsculos.

Exemplo:
java
Copiar código
String str1 = "Hello";
String str2 = "hello";
boolean result = str1.equalsIgnoreCase(str2);  // result será true
No exemplo acima, str1.equalsIgnoreCase(str2) retorna true porque ambas as strings são equivalentes, ignorando a diferença de maiúsculas e minúsculas.

---------------- ToString --------------------

O método toString é um método da classe Object em Java e é herdado por todas as classes. Quando você sobrescreve o método toString em uma classe, você define como os objetos dessa classe serão representados como strings. Essa representação é útil, por exemplo, quando você quer imprimir um objeto ou incluí-lo em uma string

Com toString():

List<Tarefa> listaDeTarefas = new ArrayList<>();
listaDeTarefas.add(new Tarefa("Comprar leite"));
listaDeTarefas.add(new Tarefa("Estudar Java"));
System.out.println(listaDeTarefas);
// Saída: [Comprar leite, Estudar Java]

Sem toString():

Tarefa tarefa = new Tarefa("Comprar leite");
System.out.println(tarefa);  
// Saída: Comprar leite