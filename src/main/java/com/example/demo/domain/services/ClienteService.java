package com.example.demo.domain.services;

import com.example.demo.dataprovider.converters.ClienteConverter;
import com.example.demo.dataprovider.converters.Converter;
import com.example.demo.dataprovider.entities.Cliente;
import com.example.demo.dataprovider.repositories.ClienteRepository;
import com.example.demo.domain.dtos.ClienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ClienteService extends AbstractService<Cliente, ClienteDTO, Long> {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteConverter clienteConverter;

    @Override
    protected JpaRepository<Cliente, Long> getRepository() {
        return clienteRepository;
    }

    @Override
    protected Converter<Cliente, ClienteDTO> getConverter() {
        return clienteConverter;
    }
}