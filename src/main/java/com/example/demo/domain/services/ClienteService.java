package com.example.demo.domain.services;

import com.example.demo.dataprovider.entities.Cliente;
import com.example.demo.domain.dtos.ClienteDTO;
import com.example.demo.domain.gateways.ClienteGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
@RequiredArgsConstructor
public class ClienteService {

    private ClienteGateway clienteGateway;

    public boolean isEmpty() {
        return false;
    }

    public Long count() {
        try {
            return clienteGateway.count();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public ClienteDTO findById(Long id) {
        return null;
    }

    public List<ClienteDTO> findAll() {
        return null;
    }

    public ClienteDTO save(ClienteDTO clienteDTO) {
        return null;
    }

    public ClienteDTO update(Long id, ClienteDTO clienteDTO) {
        return null;
    }

    public void delete(Long id) {
    }

    public Integer consultarQuantidadeFilmesLocados(Cliente cliente) {
        return null;
    }


}