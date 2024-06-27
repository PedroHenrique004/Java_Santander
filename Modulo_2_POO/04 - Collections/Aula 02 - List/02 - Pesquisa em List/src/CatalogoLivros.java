import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo 

    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autorPesquisado){

        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autorPesquisado)){
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorintervaloDeAno(int anoInicial, int anoFinal){

        List<Livro> livrosPorAno = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }

        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String tituloPesquisado){

        Livro livroComTitulo = null;

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(tituloPesquisado)){
                    livroComTitulo = l;
                    break;
                }
            }
        }

        return livroComTitulo;
    }
}
