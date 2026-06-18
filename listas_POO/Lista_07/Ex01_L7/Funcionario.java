public class Funcionario extends Usuario {
    private String matricula;

    public Funcionario(String nome, String senha, String matricula) {
        super(nome, senha);
        this.matricula = matricula;
    }

    // Método específico de quem é funcionário
    public void realizarVenda() {
        System.out.println(this.nome + " está registrando uma venda.");
    }

    public String getMatricula() {
        return this.matricula;
    }
}