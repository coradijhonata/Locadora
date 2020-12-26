package com.example.demo.services;


import com.example.demo.domain.entities.Cliente;
import com.example.demo.domain.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> listarClientes(ClienteRepository clienteRepository) {
        return (List<Cliente>) clienteRepository.findAll();
    }

    public Optional<Cliente> pegarClienteId(int id) {
        return clienteRepository.findById(id);
    }

    public void deletarClienteId(int id) {
        clienteRepository.deleteById(id);
    }
}