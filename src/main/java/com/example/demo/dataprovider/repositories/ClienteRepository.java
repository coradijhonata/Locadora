package com.example.demo.dataprovider.repositories;

import com.example.demo.dataprovider.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // TODO - procurar como criar query JPA
    // criar query para contar quantidade de filmes locados por cliente

}
