public class LivroEdicaoOuro extends Livro {

    public LivroEdicaoOuro(String titulo, String autor, Double preco) throws LivroInvalidoException, AutorInvalidoException{
        super(titulo, autor, preco);
    }

    @Override
    public double getPreco(){
        return this.preco + (this.preco * 0.30);
    }

}