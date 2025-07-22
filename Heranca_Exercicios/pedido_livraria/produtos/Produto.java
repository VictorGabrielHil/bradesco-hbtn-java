package Heranca_Exercicios.pedido_livraria.produtos;

public abstract class Produto {
    String titulo;
    int ano;
    String pais;
    double precoDouble;

    public Produto(String titulo, int ano, String pais, double precoDouble) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.precoDouble = precoDouble;
    }

    public abstract double obterPrecoLiquido();


}
