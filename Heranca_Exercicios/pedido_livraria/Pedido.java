package Heranca_Exercicios.pedido_livraria;

import java.util.ArrayList;

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


}
