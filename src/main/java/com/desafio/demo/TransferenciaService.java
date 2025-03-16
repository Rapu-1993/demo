package com.desafio.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class TransferenciaService {

    @Autowired
    private TransferenciaRepository repository;

    public Transferencia salvar(Transferencia transferencia) {
        // Calcular a taxa com base na data de transferência
        double taxa = calcularTaxa(transferencia.getDataTransferencia(), transferencia.getValor());
        
        if (taxa < 0) {
            throw new IllegalArgumentException("Não há taxa aplicável para a transferência.");
        }

        transferencia.setTaxa(taxa); 
        transferencia.setDataAgendamento(LocalDate.now()); 
        return repository.save(transferencia);
    }

    public List<Transferencia> listar() {
        return repository.findAll();
    }

    private double calcularTaxa(LocalDate dataTransferencia, double valor) {
        LocalDate hoje = LocalDate.now();
        long dias = ChronoUnit.DAYS.between(hoje, dataTransferencia);

        if (dias < 0) {
            throw new IllegalArgumentException("A data de transferência não pode ser no passado.");
        }

        // Calcular a taxa com base nos dias
        if (dias == 0) {
            return 3.00 + (2.5 / 100) * valor; // Taxa fixa de R$3,00 + 2,5% do valor
        } else if (dias >= 1 && dias <= 10) {
            return 12.00; // Taxa fixa de R$12,00
        } else if (dias >= 11 && dias <= 20) {
            return (8.2 / 100) * valor; // 8,2% do valor
        } else if (dias >= 21 && dias <= 30) {
            return (6.9 / 100) * valor; // 6,9% do valor
        } else if (dias >= 31 && dias <= 40) {
            return (4.7 / 100) * valor; // 4,7% do valor
        } else if (dias >= 41 && dias <= 50) {
            return (1.7 / 100) * valor; // 1,7% do valor
        } else {
            return -1; // Indica que não há taxa aplicável
        }
    }
}
