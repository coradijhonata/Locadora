package com.example.demo.services.converters;

import org.springframework.beans.BeanUtils;

public interface Converter<T, DTO> {

    public T converterDtoParaEntidade(DTO dto);

    public DTO converterEntidadeParaDto(T t);


    public default DTO converterClone(DTO source, DTO target){
        BeanUtils.copyProperties(source, target, "id");
        return target;
    }


}
