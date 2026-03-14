package org.example.contratos.service;

import org.example.contratos.model.ContratoServico;
import org.example.contratos.repository.ContratoServicoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlertaVencimentoService {

    private final ContratoServicoRepository repository;

    public AlertaVencimentoService(ContratoServicoRepository repository) {
        this.repository = repository;
    }

    public List<ContratoServico> listarContratosPertoDoFim (int diasDeAviso) {
        var hoje = LocalDate.now();
        var dataLimite = hoje.plusDays(diasDeAviso);

        return repository.findByAtivoTrueAndDataTerminoBetween(hoje, dataLimite);
    }

}
