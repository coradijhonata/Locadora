package com.example.demo.domain.repositories;

import com.example.demo.domain.entities.Locacao;
import org.springframework.data.repository.CrudRepository;

public interface LocacaoRepository extends CrudRepository<Locacao, Integer> {
}
