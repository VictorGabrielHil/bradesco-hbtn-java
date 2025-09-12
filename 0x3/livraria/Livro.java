import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;
public class Livro {
    String titulo;
    String autor;
    double preco;

    public Livro(String titulo, String autor, Double preco) throws LivroInvalidoException, AutorInvalidoException{
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {
        CharSequence tituloChars = titulo;
        if (tituloChars.length() < 3) {
            throw new LivroInvalidoException("Titulo de livro invalido");
        }else{
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws AutorInvalidoException {

            String[] nomes = autor.split(" ");

            if (nomes.length <= 1){
                throw new AutorInvalidoException("Nome de autor invalido");
            }else{
                this.autor = autor;
            }

    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws LivroInvalidoException {
        if(preco < 1.0){
            throw new LivroInvalidoException("Preco de livro invalido");
        }else{
            this.preco = preco;
        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }
}