
public class Aula_3_e_4 {
    public static void main(String[] args) {

        double salarioMinimo = 2500; // 2500 != 2.500

        short numeroCurto = 1;
        // essa conversão não da erro pois int tem mais que short
        // Imagina que o int é uma caixa maior que short, short cabe em int mas int não cabe em short
        int numeroNormal = numeroCurto;

        short numeroCurtoErro = (short) numeroNormal; // (Casting) Aqui deu certo pois eu avisei que poderia acontecer
        // short numeroCurtoErro = numeroNormal;
        // Deu erro pois os bytes diminuiram

        int numero = 5;
        System.out.println(numero);

        numero = 10;
        System.out.println(numero);

        final double PI = 3.14;

        // PI = 2.12; Não funciona pois não pode ser alterada

        System.out.println(PI);

    }
}
