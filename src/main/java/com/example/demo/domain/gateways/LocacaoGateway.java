package com.example.demo.domain.gateways;

import com.example.demo.domain.dtos.LocacaoDTO;

import java.util.List;

public interface LocacaoGateway {

    boolean isEmpty();

    Long count();

    LocacaoDTO findById(Long id);

    List<LocacaoDTO> findAll();

    LocacaoDTO save(LocacaoDTO locacaoDTO);

    LocacaoDTO update(Long id, LocacaoDTO locacaoDTO);

    void delete(Long id);

}
