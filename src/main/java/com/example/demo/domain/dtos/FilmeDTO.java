package com.example.demo.domain.dtos;

import com.example.demo.domain.entities.GeneroFilme;
import com.example.demo.domain.entities.TipoFilme;
import lombok.*;

@RequiredArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class FilmeDTO {

    private String nome;
    private String diretor;
    private int ano_lancamento;
    private TipoFilme tipoFilme;
    private int qtd_volumes_disponiveis;
    private GeneroFilme generoFilme;


}
