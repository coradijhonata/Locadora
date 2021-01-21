package com.example.demo.domain.exceptions;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApiError {

    ERRO_AO_CONTAR_FILMES("[LOCECF001]", "Erro ao contar filmes. Exception: %s"),
    ERRO_AO_BUSCAR_FILMES("[LOCEBF001]", "Erro ao buscar filmes. Exception: %s"),
    ERRO_AO_EDITAR_FILMES("[LOCEEF001]", "Erro ao editar filmes. Exception: %s"),
    ERRO_AO_ADICIONAR_FILMES("[LOCEAF001]", "Erro ao adicionar filmes. Exception: %s"),
    ERRO_AO_DELETAR_FILMES("[LOCEDF001]", "Erro ao deletar filmes. Exception: %s"),

    ERRO_AO_BUSCAR_CLIENTE("[LOCEBC001]", "Erro ao buscar cliente. Exception: %s"),
    ERRO_AO_EDITAR_CLIENTE("[LOCEEC001]", "Erro ao editar cliente. Exception: %s"),
    ERRO_AO_ADICIONAR_CLIENTE("[LOCEAC001]", "Erro ao adicionar cliente. Exception: %s"),
    ERRO_AO_DELETAR_CLIENTE("[LOCEDC001]", "Erro ao deletar cliente. Exception: %s"),

    ERRO_AO_BUSCAR_LOCACAO("[LOCEBL001]", "Erro ao buscar locacao. Exception: %s"),
    ERRO_AO_EDITAR_LOCACAO("[LOCEEL001]", "Erro ao editar locacao. Exception: %s"),
    ERRO_AO_ADICIONAR_LOCACAO("[LOCEAL001]", "Erro ao adicionar locacao. Exception: %s"),
    ERRO_AO_DELETAR_LOCACAO("[LOCEDL001]", "Erro ao deletar locacao. Exception: %s");

    private String codigo;
    private String mensagem;

}