package com.example.demo.repositories;

import com.example.demo.domain.entities.Filme;
import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme, Integer> {
}
