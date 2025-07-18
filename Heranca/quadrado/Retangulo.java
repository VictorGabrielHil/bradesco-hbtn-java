public class Retangulo extends FormaGeometrica {

    public Retangulo(){
        super();
    }
    protected double largura;
    protected double altura;

    @Override
    public double area(){
        return this.largura * this.altura;
    }

    public String toString(){
        return String.format("[%s] %.2f / %.2f",Retangulo.class.getSimpleName(),  largura ,altura);
    }

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
