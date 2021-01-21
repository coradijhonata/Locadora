package com.example.demo.dataprovider.repositories;

import com.example.demo.dataprovider.converters.ClienteConverter;
import com.example.demo.dataprovider.converters.Converter;
import com.example.demo.dataprovider.entities.Cliente;
import com.example.demo.domain.dtos.ClienteDTO;
import com.example.demo.domain.gateways.ClienteGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class ClienteDataProvider extends DataProvider<Cliente, ClienteDTO, Long> implements ClienteGateway {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    ClienteConverter clienteConverter;

    @Override
    protected JpaRepository<Cliente, Long> getRepository() {
        return clienteRepository;
    }

    @Override
    protected Converter<Cliente, ClienteDTO> getConverter() {
        return clienteConverter;
    }

    @Override
    public Integer consultarQuantidadeFilmesLocados(Cliente cliente) {
        return null;
    }
}