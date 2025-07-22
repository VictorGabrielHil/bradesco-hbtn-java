package produtos;

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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getPrecoDouble() {
        return precoDouble;
    }

    public void setPrecoDouble(double precoDouble) {
        this.precoDouble = precoDouble;
    }

    public abstract double obterPrecoLiquido();


}
