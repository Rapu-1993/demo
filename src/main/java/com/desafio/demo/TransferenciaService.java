//service

package com.desafio.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferenciaService {
    @Autowired
    private TransferenciaRepository repository;

    public Transferencia salvar(Transferencia transferencia) {
        
        return repository.save(transferencia);
    }

    public List<Transferencia> listar() {
        return repository.findAll();
    }
}
