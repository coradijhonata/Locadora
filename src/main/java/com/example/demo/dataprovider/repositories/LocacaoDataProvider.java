package com.example.demo.dataprovider.repositories;

import com.example.demo.dataprovider.converters.Converter;
import com.example.demo.dataprovider.converters.LocacaoConverter;
import com.example.demo.dataprovider.entities.Locacao;
import com.example.demo.domain.dtos.LocacaoDTO;
import com.example.demo.domain.gateways.LocacaoGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class LocacaoDataProvider extends DataProvider<Locacao, LocacaoDTO, Long> implements LocacaoGateway {

    @Autowired
    LocacaoRepository locacaoRepository;

    @Autowired
    LocacaoConverter locacaoConverter;

    @Override
    protected JpaRepository<Locacao, Long> getRepository() {
        return locacaoRepository;
    }

    @Override
    protected Converter<Locacao, LocacaoDTO> getConverter() {
        return locacaoConverter;
    }
}