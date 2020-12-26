package com.example.demo.domain.dtos;

import com.example.demo.domain.entities.Cliente;
import com.example.demo.domain.entities.Filme;
import com.example.demo.domain.entities.StatusLocacao;
import lombok.*;

import java.util.Date;

@RequiredArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class LocacaoDTO {

    private Filme filme;
    private Cliente cliente;
    private Date dtLocacao;
    private Date dtDevolucao;
    private StatusLocacao statusLocacao;


}
