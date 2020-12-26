package com.example.demo.services.services;

import com.example.demo.domain.dtos.FilmeDTO;
import com.example.demo.domain.entities.Filme;
import com.example.demo.domain.repositories.FilmeRepository;
import com.example.demo.services.converters.Converter;
import com.example.demo.services.converters.FilmeConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class FilmeService extends AbstractService<Filme, FilmeDTO, Long> {

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private FilmeConverter filmeConverter;


    @Override
    protected JpaRepository<Filme, Long> getRepository() {
        return filmeRepository;
    }

    @Override
    protected Converter<Filme, FilmeDTO> getConverter() {
        return filmeConverter;
    }
}
