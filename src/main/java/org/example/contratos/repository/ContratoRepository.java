package org.example.contratos.repository;

import org.example.contratos.model.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContratoRepository extends JpaRepository <Contrato, Long> {
    List<Contrato> findByAtivoTrue();

}
