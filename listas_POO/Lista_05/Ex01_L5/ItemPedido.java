public class ItemPedido {
    Produto produto;
    int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return produto.preco * quantidade;
    }

    public void exibir() {
        System.out.println("  - " + produto.nome
                + " x" + quantidade
                + " = R$ " + getSubtotal());
    }
}