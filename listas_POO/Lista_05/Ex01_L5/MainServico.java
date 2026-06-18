public class MainServico {
    public static void main(String[] args) {

        // Criando objetos Produto (instâncias da classe Produto)
        Produto arroz = new Produto("Arroz 5kg", 22.90, 50);
        Produto feijao = new Produto("Feijão 1kg", 8.50, 30);
        Produto cafe = new Produto("Café 500g", 14.90, 25);

        // Criando o cliente
        Cliente cliente = new Cliente("Maria");

        // Criando os itens do pedido — cada item referencia um Produto
        ItemPedido item1 = new ItemPedido(arroz, 2);
        ItemPedido item2 = new ItemPedido(feijao, 3);
        ItemPedido item3 = new ItemPedido(cafe, 1);

        // Criando o pedido — capacidade 3 itens
        Servico pedido = new Servico(cliente, 3);
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);
        pedido.definirPagamento("Cartão");

        // Exibindo o pedido completo
        pedido.exibir();
    }
}