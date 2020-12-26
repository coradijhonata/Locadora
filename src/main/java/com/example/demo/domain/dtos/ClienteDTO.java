package com.example.demo.domain.dtos;

import com.example.demo.domain.entities.Cliente;
import com.example.demo.domain.entities.GeneroCliente;


public class ClienteDTO {

    private String nome;
    private String cpf;
    private GeneroCliente sexo;
    private String telefone;
    private String email;

    public ClienteDTO(Cliente cliente) {
        this.nome = cliente.getNome();
        this.cpf = cliente.getCpf();
        this.sexo = cliente.getSexo();
        this.telefone = cliente.getTelefone();
        this.email = cliente.getEmail();
    }
}
