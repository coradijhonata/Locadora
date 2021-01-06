package com.example.demo.controllers;

import com.example.demo.domain.entities.Cliente;
import com.example.demo.domain.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes;
    }

    @GetMapping("/{id}")
    public Cliente buscarCliente(@PathVariable Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        Cliente clienteResultado = cliente.get();
        return clienteResultado;

    }

    @PostMapping
    public Cliente inserirCliente(@RequestBody Cliente cliente) {
        Cliente clienteSalvo = clienteRepository.save(cliente);
        return clienteSalvo;
    }

    @DeleteMapping("/{id}")
    public Optional<Cliente> excluirCliente(@PathVariable Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        clienteRepository.delete(cliente.get());
        return cliente;

    }

    @PutMapping
    public Cliente editarCliente(@RequestBody Cliente cliente) {
        Cliente clienteEditado = clienteRepository.save(cliente);
        return clienteEditado;
    }

}
