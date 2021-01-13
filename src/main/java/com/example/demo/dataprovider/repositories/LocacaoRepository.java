package com.example.demo.dataprovider.repositories;

import com.example.demo.dataprovider.entities.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocacaoRepository extends JpaRepository<Locacao, Long> {
}
