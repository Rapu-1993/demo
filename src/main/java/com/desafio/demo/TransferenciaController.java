package com.desafio.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {

    @Autowired
    private TransferenciaService service;

    @PostMapping
    public ResponseEntity<Transferencia> agendar(@RequestBody Transferencia transferencia) {
        try {
            return ResponseEntity.ok(service.salvar(transferencia));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null); 
        }
    }

    @GetMapping
    public ResponseEntity<List<Transferencia>> listar() {
        return ResponseEntity.ok(service.listar());
    }
}
