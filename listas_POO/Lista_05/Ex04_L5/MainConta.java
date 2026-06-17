public class MainConta {
    public static void main(String[] args) {
        // Criando uma conta com R$ 100,00 de saldo inicial
        ContaCorrente minhaConta = new ContaCorrente(100.0);

        // Testando as operações
        minhaConta.depositar(50.0);
        System.out.println("Saldo atual: R$ " + minhaConta.obterSaldo());

        // Tentando um saque válido (R$ 40,00 + R$ 1,50 = R$ 41,50)
        minhaConta.sacar(40.0);
        System.out.println("Saldo após saque: R$ " + minhaConta.obterSaldo());

        // Tentando um saque inválido por falta de saldo para a taxa
        minhaConta.sacar(108.0);
    }
}