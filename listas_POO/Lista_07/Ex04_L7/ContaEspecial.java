public class ContaEspecial extends Conta {
    private float limite;

    public ContaEspecial(int numero, float saldoInicial, float limite) {
        super(numero, saldoInicial);
        this.limite = limite;
    }

    @Override
    public boolean sacar(float valor) {
        if (valor > 0 && (this.saldo + this.limite) >= valor) {
            this.saldo -= valor;
            System.out.println("Saque especial de R$ " + valor + " na conta " + this.numero);
            return true;
        }
        System.out.println("Saldo e limite insuficientes na conta " + this.numero);
        return false;
    }
}