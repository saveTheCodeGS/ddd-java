package models;

public class Emergencia {
    private String tipo;
    private String descricao;
    private String localizacao;

    public Emergencia(String tipo, String descricao, String localizacao) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.localizacao = localizacao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    @Override
    public String toString() {
        return "Emergência: " + tipo +
                "\nDescrição: " + descricao +
                "\nLocalização: " + localizacao;
    }
}

