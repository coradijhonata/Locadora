package com.example.demo.services.converters;

import com.example.demo.domain.dtos.ClienteDTO;
import com.example.demo.domain.entities.Cliente;
import org.springframework.beans.BeanUtils;

public class ClienteConverter implements Converter<Cliente, ClienteDTO> {


    @Override
    public Cliente converterDtoParaEntidade(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        BeanUtils.copyProperties(clienteDTO, cliente);
        return cliente;
    }

    @Override
    public ClienteDTO converterEntidadeParaDto(Cliente cliente) {
        ClienteDTO clienteDTO = new ClienteDTO();
        BeanUtils.copyProperties(cliente, clienteDTO);
        return clienteDTO;
    }
}
