public class Empregado{

    double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    double calcularBonus(Departamento departamento){
        return departamento.alcancouMeta() ? this.salarioFixo * 0.1 : 0;
    }

    double calcularSalarioTotal(Departamento departamento){
        return  this.salarioFixo + calcularBonus(departamento);
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }
}