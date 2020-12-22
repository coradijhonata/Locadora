package com.example.demo.services;

import com.example.demo.domain.entities.Filme;
import com.example.demo.repositories.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    FilmeRepository filmeRepository;

    public List<Filme> listarFilme(FilmeRepository filmeRepository) {
        return (List<Filme>) filmeRepository.findAll();
    }

    public Optional<Filme> pegarFilmeId(int id) {
        return filmeRepository.findById(id);
    }

    public void deletarFilmeId(int id) {
        filmeRepository.deleteById(id);
    }
}
