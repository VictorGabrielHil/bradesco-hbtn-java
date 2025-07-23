package provedores;


public enum TipoProvedorFrete {
    SEDEX("Sedex"),
    JADLOG("JadLog"),
    LOGGI("Loggi");

    private String nome;
    TipoProvedorFrete(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}


