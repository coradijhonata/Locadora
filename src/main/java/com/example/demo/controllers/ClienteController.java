package com.example.demo.controllers;

import com.example.demo.domain.dtos.ClienteDTO;
import com.example.demo.domain.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteDTO> listarClientes() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public ClienteDTO buscarCliente(@PathVariable Long id) {
        return clienteService.findById(id);

    }

    @PostMapping
    public ClienteDTO inserirCliente(@RequestBody ClienteDTO clienteDTO) {
        return clienteService.save(clienteDTO);
    }

    @DeleteMapping("/{id}")
    public void excluirCliente(@PathVariable Long id) {
        clienteService.delete(id);
    }

    @PutMapping
    public ClienteDTO editarCliente(@RequestBody ClienteDTO clienteDTO) {
        return clienteService.save(clienteDTO);
    }

}