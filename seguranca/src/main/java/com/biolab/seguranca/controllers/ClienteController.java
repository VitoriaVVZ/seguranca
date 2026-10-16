package com.biolab.seguranca.controllers;

import com.biolab.seguranca.dto.ClienteDTO;
import com.biolab.seguranca.services.ClienteService;
import org.hibernate.query.NativeQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/clientes")
public class ClienteController {

    private final ClienteService service;
    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> ola(){
        return ResponseEntity.ok("Ola");
    }

    @PostMapping
    public ResponseEntity<?> criarClientes(@RequestBody ClienteDTO dto){
        return ResponseEntity.ok(service.criarCliente(dto));
    }
}
