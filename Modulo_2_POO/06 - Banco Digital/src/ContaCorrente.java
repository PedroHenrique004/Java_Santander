public class ContaCorrente extends Conta {

    // Construtor da classe ContaCorrente
    public ContaCorrente(int agencia, double saldo) {
        super(agencia, saldo);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
