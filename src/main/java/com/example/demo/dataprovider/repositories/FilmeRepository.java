package com.example.demo.dataprovider.repositories;

import com.example.demo.dataprovider.entities.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
