package com.example.demo.domain.dtos;

import com.example.demo.dataprovider.entities.GeneroCliente;
import lombok.*;

@RequiredArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ClienteDTO extends BaseDTO {

    private Long id;
    private String nome;
    private String cpf;
    private GeneroCliente sexo;
    private String telefone;
    private String email;

}
