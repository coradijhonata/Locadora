package com.example.demo.dataprovider.repositories;

import com.example.demo.dataprovider.converters.Converter;
import com.example.demo.dataprovider.converters.FilmeConverter;
import com.example.demo.dataprovider.entities.Filme;
import com.example.demo.domain.dtos.FilmeDTO;
import com.example.demo.domain.gateways.FilmeGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class FilmeDataProvider extends DataProvider<Filme, FilmeDTO, Long> implements FilmeGateway {

    @Autowired
    FilmeRepository filmeRepository;

    @Autowired
    FilmeConverter filmeConverter;

    @Override
    protected JpaRepository<Filme, Long> getRepository() {
        return filmeRepository;
    }

    @Override
    protected Converter<Filme, FilmeDTO> getConverter() {
        return filmeConverter;
    }
}
