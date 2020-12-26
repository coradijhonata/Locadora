package com.example.demo.domain.dtos;

import com.example.demo.domain.entities.Filme;
import com.example.demo.domain.entities.GeneroFilme;
import com.example.demo.domain.entities.TipoFilme;

public class FilmeDTO {

    private String nome;
    private String diretor;
    private int ano_lancamento;
    private TipoFilme tipoFilme;
    private int qtd_volumes_disponiveis;
    private GeneroFilme generoFilme;

    public FilmeDTO(Filme filme){
        this.nome = filme.getNome();
        this.diretor = filme.getDiretor();
        this.ano_lancamento = filme.getAno_lancamento();
        this.tipoFilme = filme.getTipoFilme();
        this.qtd_volumes_disponiveis = filme.getQtd_volumes_disponiveis();
        this.generoFilme = filme.getGeneroFilme();

    }

}
