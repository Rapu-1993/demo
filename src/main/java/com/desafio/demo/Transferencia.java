package com.desafio.demo;


import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Transferencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contaOrigem;
    private String contaDestino;
    private Double valor;
    private Double taxa;
    private LocalDate dataTransferencia;
    private LocalDate dataAgendamento;

  
}
