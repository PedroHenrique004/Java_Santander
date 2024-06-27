------------ Crio a classe contato -----------------

Olhar o arquivo Contato.java

Dessa vez crio o setter -> Serve para alterar o valor de um atributo

public void setNumero(int numero) {
        this.numero = numero;
    }


OBS: Ela não explicou como criar esse trecho, foi a ide que fez automaticamente:

    Mas ele não permite contatos com o mesmo nome

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    public int hashCode(){
        return Objects.hash(getNome());
    }

---------------- Crio a classe AgendaContato --------------------------------

-> Crio o Set que receb o tipo Contato chamado contatoSet

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>(); -> Informo que contatoSet é uma HashSet
    }

------------------------ Crio os metodos ------------------------------

Olhar o AgendaContatos.java

-> O de adcionar é basico

--------------- Metodo de pesquisar Contato pelo nome ------------------------

    public Set<Contato> pesquisarPorNome(String nome){ -> O metodo me retorna um Set que receb o tipo Contato

        Set<Contato> contatosPorNome = new HashSet<>(); -> crio o Set contatosPorNome e indico que ele é um HashSet

        for(Contato c: contatoSet){ -> Foreach na contatoSet
            if(c.getNome().startsWith(nome)){ -> Se tiver algum contato que começa com o nome passado 
                contatosPorNome.add(c);       ->  Ele adiciona esse contato ao Set criado chamado contatosPorNome   
            }
        }

        return contatosPorNome;
    }