package com.example.demo.dataprovider.converters;

import com.example.demo.dataprovider.entities.Locacao;
import com.example.demo.domain.dtos.LocacaoDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
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
