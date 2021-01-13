package com.example.demo.dataprovider.converters;

import com.example.demo.dataprovider.entities.Filme;
import com.example.demo.domain.dtos.FilmeDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class FilmeConverter implements Converter<Filme, FilmeDTO> {


    @Override
    public Filme converterDtoParaEntidade(FilmeDTO filmeDTO) {
        Filme filme = new Filme();
        BeanUtils.copyProperties(filmeDTO, filme);
        return filme;
    }

    @Override
    public FilmeDTO converterEntidadeParaDto(Filme filme) {
        FilmeDTO filmeDTO = new FilmeDTO();
        BeanUtils.copyProperties(filme, filmeDTO);
        return filmeDTO;
    }
}
