package views;

import controllers.EmergenciaController;
import models.Emergencia;

import javax.swing.*;
import java.util.List;

public class MenuView {
    EmergenciaController controller = new EmergenciaController();

    public void exibirMenu() {
        String opcao = "";

        do {
            opcao = JOptionPane.showInputDialog(
                    """
                    *** Sistema de Emergência ***
                    
                    1 - Relatar Emergência
                    2 - Ver Telefones Úteis
                    3 - Dicas de Sobrevivência
                    4 - Ver Alertas da Defesa Civil
                    5 - Listar Emergências Registradas
                    0 - Sair
                    
                    Escolha uma opção:
                    """
            );

            if (opcao == null) break;

            switch (opcao) {
                case "1" -> relatarEmergencia();
                case "2" -> mostrarTelefones();
                case "3" -> mostrarDicas();
                case "4" -> mostrarAlertas();
                case "5" -> listarEmergencias();
                case "0" -> JOptionPane.showMessageDialog(null, "Saindo...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
            }

        } while (!opcao.equals("0"));
    }

    private void relatarEmergencia() {
        String tipo = JOptionPane.showInputDialog("Tipo de emergência (Queimada, Enchente, etc.):");
        String descricao = JOptionPane.showInputDialog("Descreva a emergência:");
        String localizacao = JOptionPane.showInputDialog("Informe sua localização (bairro, cidade):");

        controller.registrarEmergencia(tipo, descricao, localizacao);
        JOptionPane.showMessageDialog(null, "Emergência registrada com sucesso!");
    }

    private void mostrarTelefones() {
        String telefones = """
                📞 Telefones Úteis:
                
                🔥 Bombeiros: 193
                🚓 Polícia Militar: 190
                🚑 SAMU: 192
                🏥 Defesa Civil: 199
                🏛️ IBAMA (Queimadas): 0800-61-8080
                """;
        JOptionPane.showMessageDialog(null, telefones);
    }

    private void mostrarDicas() {
        String tipo = JOptionPane.showInputDialog("Para qual tipo de emergência deseja as dicas? (Queimada, Enchente, Deslizamento)");

        String dicas = switch (tipo.toLowerCase()) {
            case "queimada" -> """
                    🔥 Dicas para Queimadas:
                    - Mantenha-se longe da fumaça.
                    - Molhe panos e use no rosto.
                    - Feche portas e janelas.
                    - Busque abrigo em locais seguros.
                    """;
            case "enchente" -> """
                    🌊 Dicas para Enchentes:
                    - Evite atravessar áreas alagadas.
                    - Desligue energia elétrica.
                    - Procure locais altos.
                    """;
            case "deslizamento" -> """
                    🏔️ Dicas para Deslizamentos:
                    - Observe rachaduras nas paredes.
                    - Saia imediatamente se notar sinais de deslizamento.
                    - Procure locais seguros e afastados de encostas.
                    """;
            default -> "Tipo de emergência não reconhecido.";
        };

        JOptionPane.showMessageDialog(null, dicas);
    }

    private void mostrarAlertas() {
        String alerta = """
                🚨 ALERTA DA DEFESA CIVIL 🚨
                Risco alto de queimadas na sua região.
                Evite fazer fogo ao ar livre.
                Mantenha-se informado pelos canais oficiais.
                """;
        JOptionPane.showMessageDialog(null, alerta);
    }

    private void listarEmergencias() {
        List<Emergencia> lista = controller.listarEmergencias();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma emergência registrada.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (Emergencia e : lista) {
                sb.append(e.toString()).append("\n\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }
}
