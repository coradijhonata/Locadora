package com.example.demo.dtos;

import com.example.demo.domain.entities.Cliente;
import com.example.demo.domain.entities.Filme;
import com.example.demo.domain.entities.StatusLocacao;

import java.util.Date;

public class LocacaoDTO {

    private Filme filme;
    private Cliente cliente;
    private Date dtLocacao;
    private Date dtDevolucao;
    private StatusLocacao statusLocacao;

}
