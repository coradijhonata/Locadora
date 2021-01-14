package com.example.demo.domain.gateways;

import com.example.demo.dataprovider.entities.Cliente;
import com.example.demo.domain.dtos.ClienteDTO;

import java.util.List;

public interface ClienteGateway {

    boolean isEmpty();

    Long count();

    ClienteDTO findById(Long id);

    List<ClienteDTO> findAll();

    ClienteDTO save(ClienteDTO clienteDTO);

    ClienteDTO update(Long id, ClienteDTO clienteDTO);

    void delete(Long id);

    Integer consultarQuantidadeFilmesLocados(Cliente cliente);


}
