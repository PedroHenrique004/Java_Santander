import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        for (Convidado conv : convidadoSet) {
            if (conv.getCodigoConvite() == codigoConvite) {
                System.out.println("Código de convite já existe. Não foi possível adicionar o convidado.");
                return;
            }
        }
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    

    public void removerConvidadoPorConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for(Convidado c: convidadoSet){
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }

        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }
}
