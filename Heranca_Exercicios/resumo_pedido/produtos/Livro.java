package produtos;
public class Livro extends produtos.Produto {

    private int paginas;
    private String autor;
    private int edicao;

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
        super(titulo,ano,pais,precoBruto);
        this.paginas = paginas;
        this.autor = autor;
        this.edicao = edicao;

    }

    @Override
    public double obterPrecoLiquido() {
        return this.precoDouble + (this.precoDouble * 0.15);
    }
}
