import Heranca.retangulo_completo.FormaGeometrica;

public class Retangulo extends FormaGeometrica {

    public Retangulo(){
        super();
    }
    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }
    }

}
