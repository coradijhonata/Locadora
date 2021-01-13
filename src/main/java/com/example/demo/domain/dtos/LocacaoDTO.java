package com.example.demo.domain.dtos;

import com.example.demo.dataprovider.entities.Cliente;
import com.example.demo.dataprovider.entities.Filme;
import com.example.demo.dataprovider.entities.StatusLocacao;
import lombok.*;

import java.util.Date;

@RequiredArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class LocacaoDTO extends BaseDTO {

    private Long id;
    private Filme filme;
    private Cliente cliente;
    private Date dtLocacao;
    private Date dtDevolucao;
    private StatusLocacao statusLocacao;


}
