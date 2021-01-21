package com.example.demo.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpServerErrorException;

import static com.example.demo.domain.exceptions.ApiError.ERRO_AO_CONTAR_FILMES;

public class FalhaAoContarFilmesException extends HttpServerErrorException {

    public FalhaAoContarFilmesException(Throwable cause) {
        super(HttpStatus.valueOf(String.format(ERRO_AO_CONTAR_FILMES.getMensagem(), cause.getMessage(),
                cause.getMessage(),
                ERRO_AO_CONTAR_FILMES.getCodigo(),
                cause)));
    }
}