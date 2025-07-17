public class Gerente extends Empregado {

    public Gerente(double salarioFixo){
        super(salarioFixo);
    }
    @Override
    double calcularBonus(Departamento departamento){
        return departamento.alcancouMeta() ? this.salarioFixo * 0.2 : 0;
    }
}