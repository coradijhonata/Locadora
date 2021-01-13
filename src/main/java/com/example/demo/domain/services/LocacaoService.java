package com.example.demo.domain.services;

import com.example.demo.dataprovider.converters.Converter;
import com.example.demo.dataprovider.converters.LocacaoConverter;
import com.example.demo.dataprovider.entities.Locacao;
import com.example.demo.dataprovider.repositories.LocacaoRepository;
import com.example.demo.domain.dtos.LocacaoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class LocacaoService extends AbstractService<Locacao, LocacaoDTO, Long> {

    @Autowired
    private LocacaoRepository locacaoRepository;

    @Autowired
    private LocacaoConverter locacaoConverter;

    @Override
    protected JpaRepository<Locacao, Long> getRepository() {
        return locacaoRepository;
    }

    @Override
    protected Converter<Locacao, LocacaoDTO> getConverter() {
        return locacaoConverter;
    }
}