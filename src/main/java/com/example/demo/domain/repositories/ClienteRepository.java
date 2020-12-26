package com.example.demo.domain.repositories;

import com.example.demo.domain.entities.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
}
