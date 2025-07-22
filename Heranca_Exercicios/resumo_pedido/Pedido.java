public class Pedido {

    private double percentualDesconto;
    ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto / 100;
        this.itens = itens;
    }

    public double calcularTotal(){
        double somaTotal = 0;
        for(ItemPedido item : itens){
            somaTotal += (item.getQuantidade() * item.getProduto().obterPrecoLiquido());
        }
        double percentual= somaTotal * this.percentualDesconto;
        return  somaTotal -percentual;
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");

        double totalProdutos = 0;

        for (ItemPedido item : itens) {
            String tipo = item.getProduto() instanceof produtos.Livro ? "Livro" : "Dvd";
            double precoLiquido = item.getProduto().obterPrecoLiquido();
            double totalItem = precoLiquido * item.getQuantidade();
            totalProdutos += totalItem;

            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                    tipo,
                    item.getProduto().getTitulo(),
                    precoLiquido,
                    item.getQuantidade(),
                    totalItem
            );
        }

        double valorDesconto = totalProdutos * this.percentualDesconto;
        double totalPedido = totalProdutos - valorDesconto;

        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", valorDesconto);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", totalProdutos);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", totalPedido);
        System.out.println("----------------------------");
    }

}
