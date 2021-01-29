package com.example.demo.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpServerErrorException;

import static com.example.demo.domain.exceptions.ApiError.ERRO_AO_BUSCAR_FILMES;

public class FalhaAoBuscarFilmeException extends HttpServerErrorException {

    public FalhaAoBuscarFilmeException(Throwable cause) {

        super(HttpStatus.NOT_FOUND, ERRO_AO_BUSCAR_FILMES.getCodigo().concat(String.format(ERRO_AO_BUSCAR_FILMES.getMensagem(), cause.getMessage())));
    }

}