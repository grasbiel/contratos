package org.example.contratos.repository;

import org.example.contratos.model.ContratoServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ContratoServicoRepository extends JpaRepository <ContratoServico, Long> {
    List<ContratoServico> findByAtivoTrueAndDataTerminoBetween(LocalDate hoje, LocalDate dataLimite);
}
