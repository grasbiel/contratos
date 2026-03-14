package org.example.contratos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class ContratoServico extends Contrato{

    private String cnpjPrestador;
    private String nomeEmpresa;

    private LocalDate dataTermino;
    private Integer diaVencimento;

    @Enumerated(EnumType.STRING)
    private IndiceReajuste indiceReajuste;

    private BigDecimal valorMensal;
    private boolean renovacaoAutomatica;

    public ContratoServico(){}

    public ContratoServico(String numeroContrato, LocalDate dataInicio, String cnpjPrestador, String nomeEmpresa, BigDecimal valorMensal){
        super(numeroContrato, dataInicio);
        this.cnpjPrestador = cnpjPrestador;
        this.nomeEmpresa = nomeEmpresa;
        this.valorMensal = valorMensal;
        this.renovacaoAutomatica = false;
    }

    public String getCnpjPrestador() {return cnpjPrestador;}
    public String getNomeEmpresa() {return nomeEmpresa;}
    public LocalDate getDataTermino() {return dataTermino;}
    public Integer getDiaVencimento() {return diaVencimento;}
    public IndiceReajuste getIndiceReajuste() {return indiceReajuste;}
    public BigDecimal getValorMensal() {return valorMensal;}
    public boolean isRenovacaoAutomatica() {return renovacaoAutomatica;}


}
