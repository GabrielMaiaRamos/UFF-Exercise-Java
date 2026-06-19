public class MainBanco {
    public static void main(String[] args) {
        ContaComum cc = new ContaComum(101, 500);
        cc.depositar(100);
        cc.sacar(700); // Falha

        ContaPoupanca cp = new ContaPoupanca(202, 1000);
        cp.render(10); // Adiciona 100
        cp.sacar(500); // Sucesso

        ContaEspecial ce = new ContaEspecial(303, 500, 1000);
        ce.sacar(1200); // Sucesso (usa o limite)
    }
}
