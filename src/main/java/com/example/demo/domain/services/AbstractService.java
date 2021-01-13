package com.example.demo.domain.services;

import com.example.demo.dataprovider.converters.Converter;
import com.example.demo.dataprovider.entities.Persistable;
import com.example.demo.domain.dtos.BaseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class AbstractService<T extends Persistable<PK>, DTO extends BaseDTO, PK extends Serializable> {

    protected abstract JpaRepository<T, PK> getRepository();

    protected abstract Converter<T, DTO> getConverter();

    public boolean isEmpty() {
        return getRepository().count() == 0;
    }

    public Long count() {
        return getRepository().count();
    }

    public DTO findById(PK id) {
        Optional<T> entity = getRepository().findById(id);
        Optional<DTO> dto = entity.isPresent() ? Optional.of(getConverter().converterEntidadeParaDto(entity.get())) : Optional.empty();
        return dto.orElseThrow(EntityNotFoundException::new);
    }

    public List<DTO> findAll() {
        List<T> entities = getRepository().findAll();
        return entities.stream().map(entity -> getConverter().
                converterEntidadeParaDto(entity)).
                collect(Collectors.toList());
    }

    public DTO save(DTO dto) {
        T entity = getConverter().converterDtoParaEntidade(dto);
        T entityBanco = getRepository().save(entity);
        return getConverter().converterEntidadeParaDto(entityBanco);
    }

    public DTO update(PK id, DTO dto) {
        DTO dtoEncontrado = this.findById(id);
        dtoEncontrado = getConverter().converterClone(dto, dtoEncontrado);
        return save(dtoEncontrado);
    }

    public void delete(PK id) {
        getRepository().deleteById(id);
    }

}