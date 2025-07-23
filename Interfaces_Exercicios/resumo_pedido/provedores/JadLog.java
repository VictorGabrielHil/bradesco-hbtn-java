package provedores;


public class JadLog implements  ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete =  peso > 7000 ? (valor * 0.2) : (valor * 0.045);
        return new Frete(valorFrete, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
