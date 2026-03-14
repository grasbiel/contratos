package org.example.contratos.model;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class ContratoTerreno extends Contrato {
    private String enderecoTerreno;
    private Double tamanhoMetrosQuadrados;

    public ContratoTerreno() {}

    public ContratoTerreno (String numeroContrato, LocalDate dataInicio, String enderecoTerreno, Double tamanhoMetrosQuadrados ) {
        super(numeroContrato, dataInicio);
        this.enderecoTerreno = enderecoTerreno;
        this.tamanhoMetrosQuadrados = tamanhoMetrosQuadrados;
    }

    public String getEnderecoTerreno() { return enderecoTerreno; }
    public Double getTamanhoMetrosQuadrados() {return tamanhoMetrosQuadrados; }
}
