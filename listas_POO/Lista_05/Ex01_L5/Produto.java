public class Produto {
    String nome;
    double preco;
    int estoque;

    // Construtor: instancia um novo Produto
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void exibir() {
        System.out.printf("%s | R$ %.2lf | Estoque: %d\n", nome, preco, estoque);
    }

}