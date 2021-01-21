package com.example.demo.domain.gateways;

import com.example.demo.domain.dtos.FilmeDTO;

import java.util.List;

public interface FilmeGateway {

    boolean isEmpty();

    Long count();

    FilmeDTO findById(Long id);

    List<FilmeDTO> findAll();

    FilmeDTO save(FilmeDTO filmeDTO);

    FilmeDTO update(Long id, FilmeDTO filmeDTO);

    void delete(Long id);

}
