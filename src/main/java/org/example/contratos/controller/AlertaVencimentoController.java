package org.example.contratos.controller;

import org.example.contratos.model.ContratoServico;
import org.example.contratos.service.AlertaVencimentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/contratos/alertas")
public class AlertaVencimentoController {

    private final AlertaVencimentoService alertaService;

    public AlertaVencimentoController(AlertaVencimentoService alertaService) {
        this.alertaService = alertaService;
    }

    @GetMapping("/vencendo")
    public ResponseEntity<List<ContratoServico>> buscarVencimento(@RequestParam(defaultValue = "30") int dias){
        var lista = alertaService.listarContratosPertoDoFim(dias);
        return ResponseEntity.ok(lista);
    }
}
