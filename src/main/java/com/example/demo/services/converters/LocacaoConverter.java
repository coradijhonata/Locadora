package com.example.demo.services.converters;

import com.example.demo.domain.dtos.LocacaoDTO;
import com.example.demo.domain.entities.Locacao;
import org.springframework.beans.BeanUtils;

public class LocacaoConverter implements Converter<Locacao, LocacaoDTO> {
    @Override
    public Locacao converterDtoParaEntidade(LocacaoDTO locacaoDTO) {
        Locacao locacao = new Locacao();
        BeanUtils.copyProperties(locacaoDTO, locacao);
        return locacao;
    }

    @Override
    public LocacaoDTO converterEntidadeParaDto(Locacao locacao) {
        LocacaoDTO locacaoDTO = new LocacaoDTO();
        BeanUtils.copyProperties(locacao, locacaoDTO);
        return locacaoDTO;
    }
}
