public class Conta {
    protected int numero;
    protected float saldo;

    public Conta(int numero, float saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        if (valor > 0) // so depositar se for valor positivo
            this.saldo += valor;
    }

    public boolean sacar(float valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return true;
        }
    }

    public int getNumero() {
        return this.numero;
    }

    public float getsaldo() {
        return this.saldo;
    }
}
