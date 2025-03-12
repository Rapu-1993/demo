//controller

package com.desafio.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {
    @Autowired
    private TransferenciaService service;

    @PostMapping
    public ResponseEntity<Transferencia> agendar(@RequestBody Transferencia transferencia) {
        return ResponseEntity.ok(service.salvar(transferencia));
    }

    @GetMapping
    public ResponseEntity<List<Transferencia>> listar() {
        return ResponseEntity.ok(service.listar());
    }
}
