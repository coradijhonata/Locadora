package com.example.demo.domain.services;

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

    public boolean isEmpty(ClienteDTO clienteDTO) {
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
        try {
            return clienteGateway.findById(id);
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public List<ClienteDTO> findAll() {
        try {
            return clienteGateway.findAll();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public ClienteDTO save(ClienteDTO clienteDTO) {
        try {
            return clienteGateway.save(clienteDTO);
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public ClienteDTO update(Long id, ClienteDTO clienteDTO) {
        try {
            ClienteDTO clienteEncontrado = clienteGateway.findById(id);
            return clienteGateway.save(clienteEncontrado);
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public void delete(Long id) {
        clienteGateway.delete(id);
    }

    public Integer consultarQuantidadeFilmesLocados(ClienteDTO clienteDTO) {
        /*
         * 1 - Validar o Cliente - se ele está nulo
         * 2- Verificar se ele existe no sistema - find by id
         * 3- Criar a consulta de quantidade
         *
         * */

        return null;
    }
}