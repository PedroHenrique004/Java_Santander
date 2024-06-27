-------------------- Ordernar com Comparable e Comparator -------------------

importante: 5, 6, 7

1: Crio a classe Pessoa -> Arquivo Pessoa.java

2: No novo arquivo OrdenacaoPessoa crio uma lista do tipo pessoa:

    private List<Pessoa> pessoaList;

3: Faço pessoaList se tornar um arrayList:

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<Pessoa>();
    }

4: Criei o metodo adicionar pessoa:

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

5 : Na classe pessoa, implementei o Comparable para criar o metodo de ordenação por idade ---------------------

    public class Pessoa implements Comparable<Pessoa>{}

    -> Com isso preciso criar o comparableTo:

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare( idade, p.getIdade()); -> O Integer é um int mais reforçado que é acompanhado por vários metodos
    }

6: Volto ao ordenacaoPessoa e crio o metodo de ordenacao por idade: -----------------------------

    public List<Pessoa> ordenaPorIdade(){

            List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList); --> Faz uma copia da lista de pessoas(pessoaList)
            Collections.sort(pessoasPorIdade); ----> Usa a função sort das Collections para ordenala
            return pessoasPorIdade; --> Devolve a lista ordenada
    }


7: Crio uma ordenação por altura: ------------------------------

    -> No arquivo pessoa.java: (criei outra classe no mesmo arquivo)

    class ComparatorPorAltura implements Comparator<Pessoa> { -> Declara uma classe chamada ComparatorPorAltura que implementa a interface Comparator para objetos do tipo Pessoa.

        public int compare(Pessoa p1, Pessoa p2){
            return Double.compare(p1.getAltura(), p2.getAltura()); 

            -> o .compare retorna:

                    Um valor negativo se a altura de p1 for menor que a altura de p2.
                    Zero se as alturas forem iguais.
                    Um valor positivo se a altura de p1 for maior que a altura de p2
        }
    }

8: Crio o metodo no arquivo oredenacaoPessoa: ------------------------------

        public List<Pessoa> ordenarporAltura(){

            List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList); -> Cria uma nova lista que é a copia da pessoaList
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura()); 

            -> Ordena a lista de acordo com os parametros

                    1 parametro: lista a ser ordenada

                    2 parametro: Uma nova instância de ComparatorPorAltura, que define como as pessoas devem ser comparadas (por altura, neste caso).

            return pessoasPorAltura;
        }