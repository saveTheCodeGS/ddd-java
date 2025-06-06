package controllers;

import models.Emergencia;
import java.util.ArrayList;
import java.util.List;

public class EmergenciaController {
    private List<Emergencia> emergencias = new ArrayList<>();

    public void registrarEmergencia(String tipo, String descricao, String localizacao, int nivelRisco) {
        Emergencia emergencia = new Emergencia(tipo, descricao, localizacao, nivelRisco);
        emergencias.add(emergencia);
    }

    public List<Emergencia> listarEmergencias() {
        return emergencias;
    }
}
