package com.example.demo.domain.repositories;

import com.example.demo.domain.entities.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
