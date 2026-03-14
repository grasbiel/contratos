package org.example.contratos.config;

import org.example.contratos.model.ContratoServico;
import org.example.contratos.repository.ContratoServicoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

import static java.lang.IO.*;

@Component
public class CargaInicialDados implements CommandLineRunner {

    private final ContratoServicoRepository servicoRepository;

    public CargaInicialDados(ContratoServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    @Override
    public void run(String... args) {
        // 1. Criamos o primeiro contrato de teste
        var contrato1 = new ContratoServico(
                "SRV-001",
                LocalDate.now().minusDays(10),
                "12.345.678/0001-90",
                "Limpeza Total LTDA",
                new BigDecimal("1500.00")
        );

        contrato1.setDataTermino(LocalDate.now().plusDays(15));


        var contrato2 = new ContratoServico(
                "SRV-002",
                LocalDate.now(),
                "98.765.432/0001-10",
                "Segurança Máxima",
                new BigDecimal("3200.00")
        );

        contrato2.setDataTermino(LocalDate.now().plusDays(45));


        servicoRepository.save(contrato1);
        servicoRepository.save(contrato2);

        println("✅ Dados de teste foram salvos no banco com sucesso!");
    }
}
