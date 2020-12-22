package com.example.demo.dtos;

import com.example.demo.domain.entities.Cliente;
import com.example.demo.domain.entities.Filme;
import com.example.demo.domain.entities.Locacao;
import com.example.demo.domain.entities.StatusLocacao;

import java.util.Date;

public class LocacaoDTO {

    private Filme filme;
    private Cliente cliente;
    private Date dtLocacao;
    private Date dtDevolucao;
    private StatusLocacao statusLocacao;

    public LocacaoDTO(Locacao locacao) {
        this.filme = locacao.getFilme();
        this.cliente = locacao.getCliente();
        this.dtLocacao = locacao.getDtLocacao();
        this.dtDevolucao = locacao.getDtDevolucao();
        this.statusLocacao = locacao.getStatusLocacao();

    }

}
