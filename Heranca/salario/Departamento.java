public class Departamento {

    double valorMeta;
    double valorAtingidoMeta;

    public Departamento(double valorMeta, double valorMetaAtingida){
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorMetaAtingida;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    public boolean alcancouMeta(){
        return this.valorMeta>=valorAtingidoMeta;
    }
}