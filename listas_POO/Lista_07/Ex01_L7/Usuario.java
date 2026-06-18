public class Usuario {
    // Encapsulamento: protegendo os dados básicos
    protected String nome;
    protected String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public boolean fazerLogin(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }
}