
public class Aula_3 {
    public static void main(String[] args) {
        String meuNome = "Pedro";

        int anoDeNascimento = 2004;

        boolean verdadeiraOuFalsa = true; // = false

        verdadeiraOuFalsa = false; // ocorreu uma alteração no valor dela

        String primeiroNome = "Testando";

        String segundoNome = "Metodo";

        String nomeCompletoVariavel = "Testando variavel";

        String nomeCompletoMetodo = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompletoMetodo);
        System.out.println(nomeCompletoVariavel);


    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);

    }
}
