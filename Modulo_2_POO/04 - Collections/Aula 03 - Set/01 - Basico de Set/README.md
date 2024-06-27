---------- Crio a classe convidado --------------------

-> Olhar arquivo Convidado.java : Criei os atributos, o constructor e os getters

--------- Crio a classe ConjuntoConvidados --------------------

import java.util.HashSet;
import java.util.Set;

    public class ConjuntoConvidados {
        
        private Set<Convidado> convidadoSet; -> Crio um Set do tipo Convidado

        public ConjuntoConvidados(){
            this.convidadoSet = new HashSet<>(); -> Indico que esse Set é d tipo HashSet
        }
    }

---------- Criei os metodos para a classe ConjuntoConvidados --------------------

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite)); -> Dentro do metodo eu uso o construtor 
    }

    public void removerConvidadoPorConvite(int codigoConvite){
        Convidado convidadoParaRemover = null; -> Cria uma variavel do tipo Convidado

        for(Convidado c: convidadoSet){ -> Foreach que busca pelos convidados da lista, se achar add ele a variavel convidadoParaRemover
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }

        convidadoSet.remove(convidadoParaRemover); -> remove o candidato da variavel do Set
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }