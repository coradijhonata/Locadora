package com.example.demo.dataprovider.repositories;

import com.example.demo.dataprovider.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
