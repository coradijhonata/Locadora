package com.example.demo.domain.repositories;

import com.example.demo.domain.entities.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocacaoRepository extends JpaRepository<Locacao, Long> {
}
