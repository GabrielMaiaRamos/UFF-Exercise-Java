public class Servico {
    Cliente cliente;
    ItemPedido[] itens; // array de itens pedidos
    int totalItens;
    String formaPagamento;

    public Servico(Cliente cliente, int capacidade) {
        this.cliente = cliente;
        this.itens = new ItemPedido[capacidade]; // define o tamanho maximo do array
        this.totalItens = 0;
    }

    public void adicionarItem(ItemPedido item) {
        itens[totalItens] = item;
        totalItens++;
    }

    public void definirPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < totalItens; i++) {
            itens[i].getSubtotal();
        }
        return total;
    }

    public void exibir() {
        System.out.println("=== Pedido de: " + cliente.nome + " ===");
        for (int i = 0; i < totalItens; i++) {
            itens[i].exibir();
        }
        System.out.println("Pagamento: " + formaPagamento);
        System.out.println("Total: R$ " + calcularTotal());
    }
}