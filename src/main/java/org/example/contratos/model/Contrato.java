package org.example.contratos.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "contratos")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroContrato;
    private LocalDate dataInicio;
    private boolean ativo;

    public Contrato () {}

    public Contrato(String numeroContrato, LocalDate dataInicio){
        this.numeroContrato = numeroContrato;
        this.dataInicio = dataInicio;
        this.ativo = true;
    }

    public Long getId() { return id;}
    public String getNumeroContrato() { return numeroContrato; }
    public LocalDate getDataInicio () { return dataInicio; }
    public boolean isAtivo() { return ativo; }

    public void cancelar() { this.ativo = false; }
}
