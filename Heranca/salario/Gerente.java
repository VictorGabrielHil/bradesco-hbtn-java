public class Gerente extends Empregado {

    public Gerente(double salarioFixo){
        super(salarioFixo);
    }
    @Override
    public double calcularBonus(Departamento departamento){
        double diferencaResultado = departamento.getValorMeta() - departamento.valorAtingidoMeta;
        return departamento.alcancouMeta() ? (this.salarioFixo * 0.2) + diferencaResultado * 0.01 : 0;
    }
}