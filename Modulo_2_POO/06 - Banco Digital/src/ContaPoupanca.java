public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, double saldo) {
        super(agencia, saldo);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
