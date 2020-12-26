package com.example.demo.domain.dtos;

import com.example.demo.domain.entities.GeneroCliente;
import lombok.*;

@RequiredArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ClienteDTO {

    private String nome;
    private String cpf;
    private GeneroCliente sexo;
    private String telefone;
    private String email;

    }
