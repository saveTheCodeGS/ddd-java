package models;

/**
 * Representa uma emergência com tipo, local e nível de risco.
 */
public class Emergencia {

    private String tipo;
    private String descricao;
    private String local;
    private int nivelRisco;

    public Emergencia(String tipo, String descricao, String local, int nivelRisco) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.local = local;
        this.nivelRisco = nivelRisco;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLocal() {
        return local;
    }

    public int getNivelRisco() {
        return nivelRisco;
    }

    /**
     * Verifica se a emergência é crítica com base em um limite de risco.
     * @param limite Limite a partir do qual a emergência é crítica.
     * @return true se o nível de risco for maior ou igual ao limite.
     */
    public boolean isEmergenciaCritica(int limite) {
        return this.nivelRisco >= limite;
    }

    /**
     * Gera um resumo da emergência com ou sem o nível de risco.
     * @param incluirRisco Se true, inclui o nível de risco no resumo.
     * @return Resumo formatado da emergência.
     */
    public String gerarResumo(boolean incluirRisco) {
        if (incluirRisco) {
            return tipo + " em " + local + " | Nível de risco: " + nivelRisco + "\nDescrição: " + descricao;
        } else {
            return tipo + " em " + local + "\nDescrição: " + descricao;
        }
    }

    /**
     * Gera um resumo padrão da emergência (com risco).
     * @return Resumo formatado com risco incluso.
     */
    public String gerarResumo() {
        return gerarResumo(true); // Sobrecarga
    }

    /**
     * Sobrescreve toString() para mostrar detalhes da emergência.
     * @return String com todos os dados da emergência.
     */
    @Override
    public String toString() {
        return "Emergência: " + tipo + "\nLocal: " + local + "\nDescrição: " + descricao +
                "\nNível de risco: " + nivelRisco +
                "\nCrítica? " + (isEmergenciaCritica(7) ? "Sim" : "Não");
    }
}
