// Gerente herda de Funcionario (que herda de Usuario também)
public class Gerente extends Funcionario {

    public Gerente(String nome, String senha, String matricula) {
        super(nome, senha, matricula);
    }

    // Método exclusivo do Gerente
    public void fecharCaixa() {
        System.out.println("Caixa fechado com segurança pelo gerente " + this.nome);
    }
}