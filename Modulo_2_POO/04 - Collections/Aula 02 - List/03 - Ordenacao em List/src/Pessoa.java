import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    
    //atributos
    
    private String nome;
    
    private int idade;
    
    private double altura;
    
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
        
    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare( idade, p.getIdade());
    }
            
    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + "\n" + 
        ", idade " + idade + "\n" +
        ", altura=" + altura + "]";
    }


}

class ComparatorPorAltura implements Comparator<Pessoa> {
    public int compare(Pessoa p1, Pessoa p2){
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
