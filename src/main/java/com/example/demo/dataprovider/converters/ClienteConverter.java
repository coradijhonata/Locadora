package com.example.demo.dataprovider.converters;

import com.example.demo.dataprovider.entities.Cliente;
import com.example.demo.domain.dtos.ClienteDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
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
