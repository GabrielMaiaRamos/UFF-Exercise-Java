public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, float saldo) {
        super(numero, saldo);
    }

    public void render(float taxaRendimento) {
        float rendimento = this.saldo * (taxaRendimento / 100);
        this.depositar(rendimento);
    }
}
