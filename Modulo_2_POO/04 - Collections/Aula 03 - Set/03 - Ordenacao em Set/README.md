------------------ Crio a classe Produto ----------------------

Olhar arquivo Produto.java

OBS: Ele tem os atributos, o constructor e aquele metodo equals e hash quer não permite a repetição pelo codigo

OBS 2: Mais pra frente crio o comparable que exibe o set por ordem de nome: 

    public class Produto implements Comparable<Produto> {

        @Override
        public int compareTo(Produto p) {
            return nome.compareToIgnoreCase(p.getNome());
        }
    }

OBS 3: Mais pra frente crio o comparator no arquivo Produto fora da classe Produto: (Ele me permite comparar por preço)

    class Comparator implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}



-> já expliquei isso na aula de Pesquisa com Set

----------------- Crio a callse Cadastro produtos --------------------------------
