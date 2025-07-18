public class Quadrado extends Retangulo {
    
    public Quadrado(){
        super();
    }
    
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
            this.setLargura(lado);
            this.setAltura(lado);
        } else {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }
    }

    @Override
    public String toString() {
        return "[Quadrado] " + lado;
    }
}
