-------------- Pesquisas em Lists --------------------------------

Importantes: 5,6,7

-> Olhar arquivo livro.java

1: Criei a classe livro com os atributos: titulo, autor, anoPublicacao

   Criei também um Constructor e os metodos getters desses atributos


-> Olhar arquivo CatalogoLivros.java

2: Crio uma lista que recebe o Livro como parametro

    private List<Livro> livroList;

3: tranforma essa lista em um array list

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

4: Crio o metodo add:

    public void adicionarLivro(String titulo, String autor, Integer anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }

5: Crio o Metodo de Pesquisa por autor ----------------------------------

    -> Crio uma nova lista que receb um livro 

    public List<Livro> pesquisarPorAutor(String autorPesquisado){ -> Passo o nome do autor

        List<Livro> livrosPorAutor = new ArrayList<>();

        -> Com esse for só serão add os livros que tiverem o autor passado como parametro, se não tiver nenhum, será uma lista vazia

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autorPesquisado)){
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

6: Crio o metodo de Pesquisa por intervalo de publicacao ------------------------

-> Mesma lógica do passo 5

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

7: Pesquisa especifica por um livro com determinado titulo ------------------------

Obs: Retorna apenas o 1 encontrado na lista

public Livro pesquisarPorTitulo(String tituloPesquisado){

        -> Crio uma variavel do tipo Livro que inicia vazia

        Livro livroComTitulo = null;

        -> Faço aquele if com for que verifica se o livro passado exite, se sim, ele entra na variavel

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

