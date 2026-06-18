public class Cliente extends Usuario {
    private String cpf;
    private String endereco;

    public Cliente(String nome, String senha, String cpf, String endereco) {
        super(nome, senha); // 'super' para chamar o construtor do pai (Usuario)
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }
}